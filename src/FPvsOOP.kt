import java.util.*

class Blog {
    private val posts = mutableListOf<Post>()

    fun addPost(title: String, content: String, tags: MutableList<String>) {
        this.posts.add(Post(title, content, tags))
    }

    fun getPostsByTag(tag: String) = this.posts.filter { post -> post.tags.contains(tag) }
}

class Post(
    var title: String,
    var content: String,
    val tags: MutableList<String>
) {
    val id = UUID.randomUUID().toString()
}

