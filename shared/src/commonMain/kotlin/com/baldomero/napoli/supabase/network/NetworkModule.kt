package com.baldomero.napoli.supabase.network

import com.baldomero.napoli.supabase.network.config.NetworkConfig
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.gotrue.Auth
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.realtime.Realtime
import io.github.jan.supabase.storage.Storage

class NetworkModule(private val config: NetworkConfig) {
    val client: SupabaseClient
        get() = supabaseClient()

    private fun supabaseClient(): SupabaseClient {
        return createSupabaseClient(
            supabaseUrl = "https://${config.supabaseRef}.supabase.co",
            supabaseKey = config.supabaseKey
        ) {

            install(Storage) {
                // settings
            }

            install(Postgrest) {

            }

            install(Realtime) {
                // settings
            }

            install(Auth) {
            }
        }
    }
}