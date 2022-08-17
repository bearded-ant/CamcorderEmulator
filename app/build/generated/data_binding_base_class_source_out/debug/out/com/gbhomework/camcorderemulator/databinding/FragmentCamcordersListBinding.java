// Generated by view binder compiler. Do not edit!
package com.gbhomework.camcorderemulator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gbhomework.camcorderemulator.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCamcordersListBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final RecyclerView frCamcordersListRecycler;

  private FragmentCamcordersListBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull RecyclerView frCamcordersListRecycler) {
    this.rootView = rootView;
    this.frCamcordersListRecycler = frCamcordersListRecycler;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCamcordersListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCamcordersListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_camcorders_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCamcordersListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.frCamcordersListRecycler;
      RecyclerView frCamcordersListRecycler = ViewBindings.findChildViewById(rootView, id);
      if (frCamcordersListRecycler == null) {
        break missingId;
      }

      return new FragmentCamcordersListBinding((LinearLayoutCompat) rootView,
          frCamcordersListRecycler);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
