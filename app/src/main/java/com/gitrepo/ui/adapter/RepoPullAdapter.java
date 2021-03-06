package com.gitrepo.ui.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gitrepo.R;
import com.gitrepo.model.Application;
import com.gitrepo.model.Item;
import com.gitrepo.ui.activities.RepoPullActivity;

import java.util.List;


/**
 * Created by izabela on 1/7/18.
 */

public class RepoPullAdapter extends RecyclerView.Adapter<RepoPullAdapter.RepoPullViewHolder> {

    private RepoPullActivity context;
    private List<Item> items;

    String TAG = "REPOPULLADAPTER";

    public RepoPullAdapter(Application application, RepoPullActivity context) {
        this.context = context;
        this.items = application.items;
    }

    public RepoPullViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.repo_pull_item, parent, false);
        return new RepoPullViewHolder(view);
    }

    public void onBindViewHolder(RepoPullViewHolder holder, int position) {
        final Item item = items.get(position);

//        holder.textViewTitle.setText(String.valueOf(item.name));
//        holder.textViewDescription.setText(String.valueOf(item.description));
//        holder.textViewForks.setText(String.valueOf(item.forks_count));
//        holder.textViewStars.setText(String.valueOf(item.stargazers_count));
//
//        Picasso.with(context).load(item.owner.avatar_url).into(holder.imageViewAccount);
//        holder.textViewUserName.setText(String.valueOf(item.owner.login));
//        holder.textViewCompleteName.setText(String.valueOf(item.owner.id));
//
//        holder.cardViewRepo.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                ScreenManager.goToRepoDescription(context);
//            }
//        });
//    }

}

    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    class RepoPullViewHolder extends RecyclerView.ViewHolder {

//    public CardView cardViewRepo;
//    public TextView textViewTitle;
//    public TextView textViewDescription;
//    public TextView textViewForks;
//    public TextView textViewStars;
//    public ImageView imageViewAccount;
//    public TextView textViewUserName;
//    public TextView textViewCompleteName;

            public RepoPullViewHolder(View v) {
                super(v);

//        cardViewRepo = v.findViewById(R.id.cv_repo);
//        textViewTitle = v.findViewById(R.id.tv_title);
//        textViewDescription = v.findViewById(R.id.tv_description);
//        textViewForks = v.findViewById(R.id.tv_forks);
//        textViewStars = v.findViewById(R.id.tv_stars);
//        imageViewAccount = v.findViewById(R.id.iv_account);
//        textViewUserName = v.findViewById(R.id.tv_username);
//        textViewCompleteName = v.findViewById(R.id.tv_completename);

            }
        }
    }



