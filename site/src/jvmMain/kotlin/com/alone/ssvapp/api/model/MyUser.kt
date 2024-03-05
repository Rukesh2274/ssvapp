package com.alone.ssvapp.api.model

import org.bson.types.ObjectId

data class MyUser(
    val _id: ObjectId = ObjectId(),
    val ownerId: String,
    val coins: Int,
    val earnedCoins: Int
)