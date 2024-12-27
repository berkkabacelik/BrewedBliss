package com.example.brewedbliss.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.brewedbliss.Model.ItemsModel
import com.example.brewedbliss.Repository.MainRepository

class MainViewModel : ViewModel() {

    private val repository =  MainRepository()

    fun loadFiltered(id: Int) : LiveData<MutableList<ItemsModel>>{

        return repository.loadFiltered(id)
    }


}