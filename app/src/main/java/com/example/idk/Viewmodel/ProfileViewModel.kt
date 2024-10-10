package com.example.idk.Viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel(){
    // LiveData para os dados do usuário
    val user = MutableLiveData<User>()

    // Função para salvar as alterações
    fun saveProfile(user: User) {
        // Chamar o repositório para salvar as alterações
        repository.saveUser(user)
    }
}
}