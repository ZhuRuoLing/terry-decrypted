# Decrypted file of [Terry](https://github.com/GoblinDestroy/Terry)


## The source repository might has been removed by Github

## Steps to decrypt

 - Replace the meaningless %% variables in the original file `bytes(2).bat`.

 - Removing the excessively long line around line 3134 in `bytes.bat,` we get `wdnmd.bat`.

 - We can obtain `out.bat` by processing `wdnmd.bat` with `Main.kt`.

 - Process lines in `out.bat` that start with `%NGSX%` using `NGSX.kt`. The final content is in `final.bat`

 - The `final.bat` contains a powershell script that decrypt the excessively long line into a dll file, and load the dll by reflection.

I decrypted the dll file using the original powershell script and the decrypted file is `out.dll`



