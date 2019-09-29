package ru.bitrapid.conversationexchangeclient.ui.simplesearch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import butterknife.BindView;
import butterknife.ButterKnife;
import ru.bitrapid.conversationexchangeclient.MainActivity;
import ru.bitrapid.conversationexchangeclient.R;
import ru.bitrapid.conversationexchangeclient.api.Rest;
import ru.bitrapid.conversationexchangeclient.api.rest.RestApiCallback;
import ru.bitrapid.conversationexchangeclient.data.model.SearchRequestData;
import ru.bitrapid.conversationexchangeclient.data.model.SearchResult;
import ru.bitrapid.conversationexchangeclient.data.providers.StaticDataProvider;
import ru.bitrapid.conversationexchangeclient.data.state.SimpleSearchState;
import ru.bitrapid.conversationexchangeclient.ui.searchresult.SearchResultFragment;
import ru.bitrapid.conversationexchangeclient.ui.simplesearch.listeners.CorrespondenceChangeListener;
import ru.bitrapid.conversationexchangeclient.ui.simplesearch.listeners.CountrySelectedListener;
import ru.bitrapid.conversationexchangeclient.ui.simplesearch.listeners.FaceToFaceChangeListener;
import ru.bitrapid.conversationexchangeclient.ui.simplesearch.listeners.LearningSelectedListener;
import ru.bitrapid.conversationexchangeclient.ui.simplesearch.listeners.ResetBtnOnClickListener;
import ru.bitrapid.conversationexchangeclient.ui.simplesearch.listeners.SerchBtnOnClickListener;
import ru.bitrapid.conversationexchangeclient.ui.simplesearch.listeners.SpeaksSelectedListener;
import ru.bitrapid.conversationexchangeclient.ui.simplesearch.listeners.TownTextChangeListener;
import ru.bitrapid.conversationexchangeclient.ui.simplesearch.listeners.UsingChatSoftwareChangeListener;

public class SimpleSearchFragment extends Fragment {

    @BindView(R.id.simple_search_speaks)
    Spinner speaks;
    @BindView(R.id.simple_search_country)
    Spinner country;
    @BindView(R.id.simple_search_learning)
    Spinner learning;
    @BindView(R.id.simple_search_town)
    EditText town;
    @BindView(R.id.simple_search_face_to_face)
    Switch faceToFace;
    @BindView(R.id.simple_search_correspondence)
    Switch correspondence;
    @BindView(R.id.simple_search_chat_software)
    Switch usingChatSoftware;
    @BindView(R.id.simple_search_reset_form_btn)
    Button resetBtn;
    @BindView(R.id.simple_search_btn)
    Button searchBtn;

    private View root;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_simple_search, container, false);

        ButterKnife.bind(this, root);
        setViewAdapters();
        setViewListeners();
        updateViewData();

        return root;
    }

    public void updateViewData(){
        speaks.setSelection(SimpleSearchState.getInstance().getSpeaksIndex());
        country.setSelection(SimpleSearchState.getInstance().getCountryIndex());
        learning.setSelection(SimpleSearchState.getInstance().getLearningIndex());
        town.setText(SimpleSearchState.getInstance().getTown());
        faceToFace.setChecked(SimpleSearchState.getInstance().isFaceToFace());
        correspondence.setChecked(SimpleSearchState.getInstance().isCorrespondence());
        usingChatSoftware.setChecked(SimpleSearchState.getInstance().isChatSoftware());
    }

    private void setViewListeners(){
        speaks.setOnItemSelectedListener(new SpeaksSelectedListener());
        country.setOnItemSelectedListener(new CountrySelectedListener());
        learning.setOnItemSelectedListener(new LearningSelectedListener());
        town.addTextChangedListener(new TownTextChangeListener());
        faceToFace.setOnCheckedChangeListener(new FaceToFaceChangeListener());
        correspondence.setOnCheckedChangeListener(new CorrespondenceChangeListener());
        usingChatSoftware.setOnCheckedChangeListener(new UsingChatSoftwareChangeListener());
        resetBtn.setOnClickListener(new ResetBtnOnClickListener(this));
        searchBtn.setOnClickListener(new SerchBtnOnClickListener(this));
    }

    private void setViewAdapters(){
        ArrayAdapter<String> langAdapter = new ArrayAdapter<>(root.getContext(), android.R.layout.simple_spinner_dropdown_item, StaticDataProvider.getInstance().getLanguageLis());
        ArrayAdapter<String> countryAdapter = new ArrayAdapter<>(root.getContext(), android.R.layout.simple_spinner_dropdown_item, StaticDataProvider.getInstance().getCountryList());
        speaks.setAdapter(langAdapter);
        country.setAdapter(countryAdapter);
        learning.setAdapter(langAdapter);
    }

    private SearchRequestData prepareSearchRequest(){
        SearchRequestData searchRequest = new SearchRequestData();

        searchRequest.setN_lg(StaticDataProvider.getInstance().getLangIdByIndex(speaks.getSelectedItemPosition()));
        searchRequest.setP_lg(StaticDataProvider.getInstance().getLangIdByIndex(learning.getSelectedItemPosition()));
        searchRequest.setCountry(StaticDataProvider.getInstance().getCountryIdByIndex(country.getSelectedItemPosition()));
        searchRequest.setTown(town.getText().toString());

        return searchRequest;
    }

    public void doSearch(){
        ((MainActivity)getActivity()).showLoaderAnimation();
        final SearchResultFragment searchResultFragment = new SearchResultFragment();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.nav_host_fragment, searchResultFragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack(null);
                ft.commit();
        Rest.getInstance().doSearchRequest(prepareSearchRequest(), new RestApiCallback<SearchResult>() {
            @Override
            public void run(SearchResult res) {
                searchResultFragment.setSearchResult(res);
            }
        });
    }
}