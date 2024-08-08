package com.baldomero.napoli.supabase.network.config

interface NetworkConfig {
    val supabaseRef: String
    val supabaseKey: String
    val googleClientId: String
}