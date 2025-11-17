The THIN CLIENT Electron client app needs the ROOT CERTIFICATE AUTHORITY file in order to communicate over
https to the Xstore Mobile server, just like Xstore Mobile devices.

It is recommended that you import the Root CA into the Operating System running on the Thin Client register.
Electron will then be able to trust the Xstore Mobile server's certificate signed against that CA. 
 
Alternatively, you can place a copy of the Root CA file into a specific directory on the Thin Client register,
and Electron will import it directly when the client app starts up:

The location is:  .../xstoredata/res/ssl/cacert.pem

(the filename MUST be "cacert.pem")