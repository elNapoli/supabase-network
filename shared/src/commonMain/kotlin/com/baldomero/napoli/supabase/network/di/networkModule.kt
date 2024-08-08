package com.baldomero.napoli.supabase.network.di

import com.baldomero.napoli.supabase.network.NetworkModule
import org.koin.dsl.module

val networkModule = module {
        single { NetworkModule(get()) }
    }