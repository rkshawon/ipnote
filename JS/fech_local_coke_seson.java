Local Storage:
    Purpose: Local Storage is a client-side storage mechanism that allows you to store key-value pairs persistently in the browser.
        Data stored in Local Storage remains available even after the browser is closed and reopened.
    Scope: The data stored in Local Storage is available across all browser windows or tabs from the same domain.
        Storage Limit: Local Storage typically has a larger storage limit compared to cookies (usually around 5-10 MB per domain).
    API: It is accessed using the localStorage object in JavaScript, and the data can be set and retrieved using localStorage.
        setItem(key, value) and localStorage.getItem(key).

Session Storage:
    Purpose: Session Storage is similar to Local Storage but is session-specific.
        Data stored in Session Storage is available only during the lifetime of the page session.
        Once the session is closed (browser tab/window is closed), the data is removed.
    Scope: The data stored in Session Storage is limited to the current window or tab and is not shared across different tabs or windows.
        Storage Limit: Like Local Storage, Session Storage typically has a storage limit of around 5-10 MB per domain.
    API: It is accessed using the sessionStorage object in JavaScript, and data can be set and retrieved using sessionStorage
        setItem(key, value) and sessionStorage.getItem(key).

Cookies:
    Purpose: Cookies are small pieces of data sent from a web server and stored on the clients device.
        They are used for various purposes, such as maintaining user sessions, tracking user behavior, and storing small amounts of data.
    Scope: Cookies are sent with every HTTP request to the server, making them available across all pages and tabs within the same domain.
        Storage Limit: Cookies have a much smaller storage limit compared to Local Storage and Session Storage (usually around 4 KB per cookie).
    API: Cookies can be set and read using JavaScripts document.cookie property.
        There are also libraries and frameworks available for more convenient cookie handling.


Data Lifetime: Choose Local Storage for long-term storage, Session Storage for short-term storage, and
Cookies for both short-term and data that needs to be sent to the server with each request.

Data Size: Local Storage and Session Storage are suitable for larger data, while Cookies are best for small amounts of data.

Security: Be aware that Cookies are more vulnerable to security threats like cross-site scripting (XSS) attacks,
so they may not be suitable for storing sensitive information.

Accessibility: Local Storage and Session Storage are generally easier to work with in JavaScript than Cookies.

const Fetch
    *The Fetch API is a modern interface that allows you to make HTTP requests to servers from web browsers.
    It uses the Promise to deliver more flexible features to make requests to servers from the web browsers.
    The fetch() method is available in the global scope that instructs the web browsers to send a request to a URL.

    *link: "https://www.javascripttutorial.net/javascript-fetch-api/" // check out summery

SYNTAX:
const response=fetch( URL [, init])
URL: a URL object that represents the path of the resource to be fetched
Init (optional): Any further options such as:

Method: The request method is either GET or POST.
Headers
Body: The body can be any of the following: Body.array.Buffer(), Body.Blob(), Body.formData(), Body.json(), Body.text().
Mode
Credentials
Cache

EXAMPLE:
fetch('url', {
  Method: 'POST',
  Headers: {
    Accept: 'application.json',
    'Content-Type': 'application/json'
  },
  Body: body,
  Cache: 'default'
})

The Fetch API is a relatively new web browser feature but builds on older technologies such as AJAX.

AJAX stands for Asynchronous JavaScript and XML. It was the first widely adopted technology to allow websites
to send requests without needing to reload the entire page. Before AJAX, if you wanted to update something on your web page, you would need to reload the entire page - which was clunky and inefficient.

AJAX allowed developers to make HTTP requests without needing a full-page refresh. This technology
revolutionized web development, but it had its limitations. AJAX requests were limited to retrieving data from the same origin (domain/subdomain) as the page requested.

Enter the Fetch API. Brought about by newer web browsers, this technology had all of the power of
AJAX but with no cross-origin security issues and added support for more HTTP methods like PUT and DELETE.