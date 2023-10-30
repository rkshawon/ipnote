const libuv?
libuv is a cross platform open source library written in c langugage
it handles asynchronous non-blocing operation in nodejs using event loop and thread


req.request does not use thread poll but crypto use

callback function are executed only when the call the call stack is empty. The normal flow of 
execution fill not be interrupted to run a callback function 

timer first then i/o