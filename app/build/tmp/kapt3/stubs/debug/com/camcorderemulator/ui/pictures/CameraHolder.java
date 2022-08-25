package com.camcorderemulator.ui.pictures;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001a\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\u001b\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J(\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0016J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/camcorderemulator/ui/pictures/CameraHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/View$OnClickListener;", "Landroid/hardware/Camera$PictureCallback;", "Landroid/hardware/Camera$PreviewCallback;", "Landroid/hardware/Camera$AutoFocusCallback;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "camera", "Landroid/hardware/Camera;", "preview", "Landroid/view/SurfaceView;", "kotlin.jvm.PlatformType", "bind", "", "path", "", "onAutoFocus", "success", "", "onClick", "v", "onPictureTaken", "data", "", "onPreviewFrame", "surfaceChanged", "holder", "Landroid/view/SurfaceHolder;", "format", "", "width", "height", "surfaceCreated", "surfaceDestroyed", "app_debug"})
public final class CameraHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.SurfaceHolder.Callback, android.view.View.OnClickListener, android.hardware.Camera.PictureCallback, android.hardware.Camera.PreviewCallback, android.hardware.Camera.AutoFocusCallback {
    private final android.view.SurfaceView preview = null;
    private android.hardware.Camera camera;
    
    public CameraHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null);
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    @java.lang.Override()
    public void surfaceCreated(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceHolder holder) {
    }
    
    @java.lang.Override()
    public void surfaceChanged(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceHolder holder, int format, int width, int height) {
    }
    
    @java.lang.Override()
    public void surfaceDestroyed(@org.jetbrains.annotations.NotNull()
    android.view.SurfaceHolder holder) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void onPictureTaken(@org.jetbrains.annotations.Nullable()
    byte[] data, @org.jetbrains.annotations.Nullable()
    android.hardware.Camera camera) {
    }
    
    @java.lang.Override()
    public void onPreviewFrame(@org.jetbrains.annotations.Nullable()
    byte[] data, @org.jetbrains.annotations.Nullable()
    android.hardware.Camera camera) {
    }
    
    @java.lang.Override()
    public void onAutoFocus(boolean success, @org.jetbrains.annotations.Nullable()
    android.hardware.Camera camera) {
    }
}