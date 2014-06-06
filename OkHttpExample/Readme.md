## OkHttp Android Example

This is a simple example of implementing [Square's OkHttp library](https://github.com/square/okhttp) in an Android app

[Full write-up is here.](http://www.recursiverobot.com/post/48782017564/trying-out-squares-okhttp-client)

### OkHttp

Step zero is getting OkHttp either as a jar, or pulling down the project and building a jar with maven. When I built this, the jar was not available, so I needed to build it myself. This was quite simple, all you need to do is make sure you have Maven2 installed, and follow the instructions on OkHttp's github page.

One thing to note is that you need to be building against the parent project, not just the okhttp dir. Sometimes people package up git repos such that there are actually multiple projects in a single repo, and you only need to use one of the dirs in the project. In this case, you need the parent, it will build the child projects for you. 

Building:

    mvn clean
    mvn package -DskipTests

After you build, the jar will be in okhttp/targets.

This git repo bundles a version of okhttp that I build, but it would be better to pull down a more recent version.

### Otto

I'm also using Otto here. Check out my [post on Otto](http://www.recursiverobot.com/post/48752686831/playing-around-with-otto-on-android) for a quick primer.


