set C:\Program Files\Java\jdk-20="C:\java\jdk-11.0.1\jdk-11.0.1"
set C:\Users\USER\Desktop\JAVA PERSONAL\javafx-sdk-20.0.1\lib="C:\temp\MyProgram.jar"
set C:\Program Files\Java\jdk-20="C:\temp"

cd %C:\Program Files\Java\jdk-20%
%C:\Program Files\Java\jdk-20%\bin\java.exe --module-path %C:\Program Files\Java\jdk-20%\javafx\lib --add-modules=javafx.controls,javafx.fxml,javafx.web -jar %JARFILE%

PAUSE