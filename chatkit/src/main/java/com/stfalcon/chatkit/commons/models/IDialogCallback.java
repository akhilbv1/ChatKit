package com.stfalcon.chatkit.commons.models;

import java.util.List;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

/**
 * Created by MTRNord on 02.09.2018.
 */
public class IDialogCallback<DIALOG extends IDialog> extends DiffUtil.Callback {
    List<DIALOG> oldDialogs;
    List<DIALOG> newDialogs;

    public IDialogCallback(List<DIALOG> oldDialogs, List<DIALOG> newDialogs) {
        this.oldDialogs = oldDialogs;
        this.newDialogs = newDialogs;
    }

    @Override
    public int getOldListSize() {
        return oldDialogs.size();
    }

    @Override
    public int getNewListSize() {
        return newDialogs.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldDialogs.get(oldItemPosition).getId().equals(newDialogs.get(newItemPosition).getId());
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return oldDialogs.get(oldItemPosition).equals(newDialogs.get(newItemPosition));
    }

    @Nullable
    @Override
    public Object getChangePayload(int oldItemPosition, int newItemPosition) {
        //you can return particular field for changed item.
        return super.getChangePayload(oldItemPosition, newItemPosition);
    }
}
