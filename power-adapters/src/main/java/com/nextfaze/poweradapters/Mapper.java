package com.nextfaze.poweradapters;

import android.view.View;
import lombok.NonNull;

import javax.annotation.Nullable;
import java.util.Collection;

/** Used to determine which {@link Binder} should be used to bind an item to a {@link View}. */
public interface Mapper {
    /**
     * Given a position and item object, returns a binder that should be used to bind it to a {@link View}.
     * @param item The data object to be bound, never {@code null}.
     * @param position The position in the data set.
     * @return A binder which will be used to bind this object to a view, possible {@code null} if this mapper doesn't
     * support the object.
     */
    @Nullable
    Binder getBinder(@NonNull Object item, int position);

    /** Return a collection containing all of the possible binders this mapper could respond with. */
    @NonNull
    Collection<? extends Binder> getAllBinders();
}