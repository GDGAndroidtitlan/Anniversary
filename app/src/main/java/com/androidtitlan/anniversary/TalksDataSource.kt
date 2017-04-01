package com.androidtitlan.anniversary

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

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
object TalksDataSource {

    const val JSON_TALKS = "[ { \"date\":\"10:20 \n-\n 11:00\", \"title\":\"Codelab: Introducción a react native\", \"speaker\": { \"name\":\"Mishel Vera\", \"job\":\"Software Engineer en Segundamano\" } }, { \"date\":\"10:20 \n-\n 11:00\", \"title\":\"Codelab: ¡Android es para todos!\", \"speaker\": { \"name\":\"Diego Ramírez\", \"job\":\"Mobile Engineer en Segundamano\" } }, { \"date\":\"11:00 \n-\n 11:40\", \"title\":\"Clean Architecture\", \"speaker\": { \"name\":\"Salvador Maurilio\", \"job\":\"Mobile Engineer en Inventive\" } }, { \"date\":\"11:00 \n-\n 11:40\", \"title\":\"Codelab: Mi primera app en Kotlin\", \"speaker\": { \"name\":\"Pedro Hernández\", \"job\":\"Software Engineer en Bunsan\" } }, { \"date\":\"11:40 \n-\n 12:20\", \"title\":\"Bítacora del capitán android\", \"speaker\": { \"name\":\"Noe Branagan\", \"job\":\"Mobile Engineer en Instacarrot\" } }, { \"date\":\"11:40 \n-\n 12:20\", \"title\":\"Codelab: Introducción a Xamarin\", \"speaker\": { \"name\":\"Humberto Jaimes\", \"job\":\"Microsoft - Xamarin MVP\" } }, { \"date\":\"12:20 \n-\n 13:00\", \"title\":\"Android Good Practices\", \"speaker\": { \"name\":\"Anahí Salgado\", \"job\":\"Teacher en Platzi\" } }, { \"date\":\"12:20 \n-\n 13:00\", \"title\":\"Tackling developers in the heart of testing world\", \"speaker\": { \"name\":\"Erik González\", \"job\":\"Mobile Engineer en Segundamano\" } } ]"

    fun getTalks(): List<Talk> {
        val gson = Gson()
        val listType = object : TypeToken<List<Talk>>() {}.type
        return gson.fromJson<List<Talk>>(TalksDataSource.JSON_TALKS, listType)
    }
}
