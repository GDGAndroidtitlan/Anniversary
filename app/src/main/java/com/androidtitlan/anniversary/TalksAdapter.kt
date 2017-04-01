package com.androidtitlan.anniversary

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * Created by Pedro Hernández on 04/2017.
 */
class TalksAdapter(val talks: MutableList<Any>) : RecyclerView.Adapter<TalksAdapter.TalkViewHolder>() {

    override fun getItemCount(): Int {
        return talks.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): TalkViewHolder? {
        val itemView = parent?.inflate(R.layout.item_talk)
        return TalkViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TalkViewHolder?, position: Int) {
        val talk  = talks[position]
        holder?.bindTalk(talk)
    }

    class TalkViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView){

        fun bindTalk(talk: Any){

        }
    }
}