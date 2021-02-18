package presentation.characters


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import data.model.Character

class CharactersViewModel : ViewModel() {
    val charactersLiveData: MutableLiveData<List<Character>> = MutableLiveData()

    fun getCharacters(){
        charactersLiveData.value = createFakeCharacters()
    }
    fun createFakeCharacters(): List<Character> {
        return listOf(
            Character("Title1" , "Author 1"),
            Character("Title2" , "Author 2"),
            Character("Title3" , "Author 3")
        )
    }
}