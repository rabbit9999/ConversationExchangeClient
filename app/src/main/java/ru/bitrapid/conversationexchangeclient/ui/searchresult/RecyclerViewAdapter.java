package ru.bitrapid.conversationexchangeclient.ui.searchresult;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import ru.bitrapid.conversationexchangeclient.Config;
import ru.bitrapid.conversationexchangeclient.R;
import ru.bitrapid.conversationexchangeclient.data.model.SearchResult;
import ru.bitrapid.conversationexchangeclient.data.model.SearchResultPLang;
import ru.bitrapid.conversationexchangeclient.data.model.SearchResultRecord;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private SearchResult searchResult;
    private Context context;

    public RecyclerViewAdapter(SearchResult searchResult, Context context) {
        this.searchResult = searchResult;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_result_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SearchResultRecord record = searchResult.getRecords().get(position);

        Glide
                .with(context)
                .load(Uri.parse(Config.AVATAR_200_150_BASE + record.getAvatarId() + Config.AVATAR_IMAGE_EXTENTION))
                .into(holder.userPic);

        holder.userName.setText(record.getFirstName());
        holder.userDescription.setText(record.getDescription());

        holder.genderAge.setText(record.getAge() + ", " + record.getGender());
        holder.countryTown.setText(record.getCountryLiveIn() + ", " + record.getTown());
        holder.nativeLanguage.setText(record.getNlangs());
        holder.practicingLanguage.setText(plangListToString(record.getPlangs()));
        holder.hobbiesAndInterests.setText(record.getInterests());

        holder.lastLogin.setText(record.getLastLogin());
        holder.profileDate.setText(record.getCreated());
    }

    @Override
    public int getItemCount() {
        return searchResult.getRecords().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.user_pic)
        ImageView userPic;
        @BindView(R.id.user_name)
        TextView userName;
        @BindView(R.id.user_description)
        TextView userDescription;
        @BindView(R.id.search_result_gender_age)
        TextView genderAge;
        @BindView(R.id.search_result_country_town)
        TextView countryTown;
        @BindView(R.id.search_result_native_language)
        TextView nativeLanguage;
        @BindView(R.id.search_result_practicing_language)
        TextView practicingLanguage;
        @BindView(R.id.search_result_type_of_exchange)
        TextView typeOfExchange;
        @BindView(R.id.search_result_hobbies_and_interests)
        TextView hobbiesAndInterests;
        @BindView(R.id.search_result_last_login)
        TextView lastLogin;
        @BindView(R.id.search_result_profile_date)
        TextView profileDate;
        @BindView(R.id.search_parent_layout)
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    private String plangListToString(List<SearchResultPLang> lst){
        StringBuilder builder = new StringBuilder();
        boolean isFirst = true;
        for(SearchResultPLang lang : lst){
            if(!isFirst){
                builder.append(", ");
            }
            isFirst= false;
            builder.append(lang.getLanguage());
        }

        return builder.toString();
    }

}
