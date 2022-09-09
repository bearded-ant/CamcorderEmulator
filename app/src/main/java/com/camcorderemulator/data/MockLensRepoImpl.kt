package com.camcorderemulator.data

import com.camcorderemulator.domain.Lens
import com.camcorderemulator.domain.LensRepo
import com.gbhomework.camcorderemulator.R

class MockLensRepoImpl : LensRepo {

    private val lenses: ArrayList<Lens> = arrayListOf()

    override fun getAllLenses(): List<Lens> {
        lenses.apply {
            add(Lens("2.8", "1/2.8", 90F, 59F, R.drawable.focal_2_8))
            add(Lens("3.6", "1/2.8", 75.8F, 47.3F, R.drawable.focal_3_6))
            add(Lens("3.8", "1/2.8", 72.8F, 45F, R.drawable.focal_3_8))
            add(Lens("4", "1/2.8", 70F, 43F, R.drawable.focal_4))
            add(Lens("5", "1/2.8", 58.5F, 35F, R.drawable.focal_5))
            add(Lens("6", "1/2.8", 50.1F, 29.4F, R.drawable.focal_6))
            add(Lens("8", "1/2.8", 38.6F, 22.3F, R.drawable.focal_8))
            add(Lens("10", "1/2.8", 31.3F, 17.9F, R.drawable.focal_10))
            add(Lens("12", "1/2.8", 26.3F, 15F, R.drawable.focal_12))
        }
        return lenses
    }

}