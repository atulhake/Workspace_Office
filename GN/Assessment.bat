set projectLocation=C:\Users\iets\workspace\GN
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\src\student\testng.xml
pause