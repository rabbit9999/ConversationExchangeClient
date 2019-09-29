package ru.bitrapid.conversationexchangeclient.ui.searchresult;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.bitrapid.conversationexchangeclient.MainActivity;
import ru.bitrapid.conversationexchangeclient.R;
import ru.bitrapid.conversationexchangeclient.data.Toaster;
import ru.bitrapid.conversationexchangeclient.data.model.SearchResult;
import ru.bitrapid.conversationexchangeclient.data.state.SearchResultState;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SearchResultFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class SearchResultFragment extends Fragment {

    private SearchResult searchResult;
    private boolean rendered = false;
    private boolean loaded = false;
    private View root;
    @BindView(R.id.search_result_recycler)
    RecyclerView recyclerView;

    private OnFragmentInteractionListener mListener;

    public SearchResultFragment() {
    }

    public void setSearchResult(SearchResult result){
        SearchResultState.getInstance().setSearchResult(result);
        this.searchResult = result;
        if(loaded && !rendered){
            renderResult();
        }
    }

    private void renderResult(){
        rendered = true;
        ((MainActivity)getActivity()).hideLoaderAnimation();

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(searchResult, root.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(root.getContext()));

//        LinearLayout v = root.findViewById(R.id.search_result_container);
//        v.addView(new TextView(this.getContext()));
//        v.addView(new TextView(this.getContext()));
//        v.addView(new TextView(this.getContext()));
//
//        Toaster.getInstance().message("DONE!");


    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_search_result, container, false);
        ButterKnife.bind(this, root);

        if(SearchResultState.getInstance().getSearchResult() != null){
            searchResult = SearchResultState.getInstance().getSearchResult();
        }

        if(searchResult != null && !rendered){
            renderResult();
        }

        loaded = true;
        return root;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }

}
