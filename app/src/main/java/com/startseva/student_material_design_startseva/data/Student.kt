package com.startseva.student_material_design_startseva.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Student (
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val description: Int
)