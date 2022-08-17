package com.camcorderemulator.domain;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/camcorderemulator/domain/DimensionsDao;", "", "getAll", "", "Lcom/camcorderemulator/domain/Dimensions;", "getCamcorderDimens", "camId", "", "app_debug"})
public abstract interface DimensionsDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from camdimensions")
    public abstract java.util.List<com.camcorderemulator.domain.Dimensions> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from camdimensions cd where cd.cam_id = :camId")
    public abstract java.util.List<com.camcorderemulator.domain.Dimensions> getCamcorderDimens(int camId);
}