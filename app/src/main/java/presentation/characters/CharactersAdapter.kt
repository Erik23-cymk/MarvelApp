package presentation.characters


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.marvelheroesestudo.R
import data.model.Character
import kotlinx.android.synthetic.main.item_character.view.*

class CharactersAdapter(
    private val characters: List<Character>
) : RecyclerView.Adapter<CharactersAdapter.CharactersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_character, parent, false)
        return CharactersViewHolder(itemView)
    }

    override fun getItemCount() = characters.count()

    override fun onBindViewHolder(viewHolder: CharactersViewHolder, position: Int) {
        viewHolder.bindView(characters[position])
    }

    class CharactersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val title = itemView.textTitle
        private val author = itemView.textAuthor

        fun bindView(character: Character) {
            title.text = character.title
            author.text = character.author

            title.setOnClickListener {
                val intent = Intent(it.context, CharacterDetailActivity::class.java)
                it.context.startActivity(intent)
            }
        }
    }
}



























