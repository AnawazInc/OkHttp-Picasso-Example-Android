OkHttp-2.0.0-RC1, otto-1.3.4 and picasso-2.3.1 Example Android
==============================

okhttp-2.0.0-RC1 , okhttp-urlconnection-2.0.0-RC1 , okio-1.0.0 , otto-1.3.4 , picasso-2.3.1 example android

This is a simple example of implementing [Square's libraries (OkHttp,Otto,Picasso)](https://github.com/square/) in an Android app [Full write-up is here.](http://www.anawaz.com/)

###OkHttp
HTTP is the way modern applications network. It’s how we exchange data & media. Doing HTTP efficiently makes your stuff load faster and saves bandwidth.

OkHttp is an HTTP client that’s efficient by default:

SPDY support allows all requests to the same host to share a socket. Connection pooling reduces request latency (if SPDY isn’t available). Transparent GZIP shrinks download sizes. Response caching avoids the network completely for repeat requests. OkHttp perseveres when the network is troublesome: it will silently recover from common connection problems. If your service has multiple IP addresses OkHttp will attempt alternate addresses if the first connect fails. This is necessary for IPv4+IPv6 and for services hosted in redundant data centers. OkHttp initiates new connections with modern TLS features (SNI, ALPN), and falls back to SSLv3 if the handshake fails.

Using OkHttp is easy. Its 2.0 API is designed with fluent builders and immutability. It supports both synchronous blocking calls and async calls with callbacks.

You can try out OkHttp without rewriting your network code. The okhttp-urlconnection module implements the familiar java.net.HttpURLConnection API and the okhttp-apache module implements the Apache HttpClient API.

OkHttp supports Android 2.3 and above. For Java, the minimum requirement is 1.6.

###Otto
Otto is an event bus designed to decouple different parts of your application while still allowing them to communicate efficiently.

Forked from Guava, Otto adds unique functionality to an already refined event bus as well as specializing it to the Android platform.

###Picasso
Images add much-needed context and visual flair to Android applications. Picasso allows for hassle-free image loading in your application—often in one line of code!

`Picasso.with(context).load("http://i.imgur.com/DvpvklR.png").into(imageView);`
Many common pitfalls of image loading on Android are handled automatically by Picasso:

Handling ImageView recycling and download cancelation in an adapter.
Complex image transformations with minimal memory use.
Automatic memory and disk caching.



