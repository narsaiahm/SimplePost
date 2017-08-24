package samplepostapp

import java.lang.invoke.MethodHandleImpl.BindCaller.T

class Comment  implements Comparable<T>{

    static belongsTo = Post

    Post post
    String comment
    Commentator who = new Commentator()
    Date dateCreated

    public int compareTo(Object o) {
        return dateCreated.compareTo(o.dateCreated)
    }
}
