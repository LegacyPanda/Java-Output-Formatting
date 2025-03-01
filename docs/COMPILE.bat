@echo off

cls

set PATH=%JAVA_HOME%\bin;%PATH%
javadoc -J-version

set bin=..\bin
set docs=..\docs
set src=..\src
set data=..\data
set lib=..\lib

if exist "%bin%\*.class" del /Q "%bin%\*.class"


for %%F in (%docs%\*) do (
    if /I "%%~xF" NEQ ".bat" del /Q "%%F"
)

if exist %src%\*.class del /Q %src%\*.class
if exist %src%\legecy\panda\*.class del /Q %src%\legecy\panda\*.class

javadoc -d "%docs%" -sourcepath "%src%" -subpackages legecy

javac -sourcepath "%src%" -cp "%bin%" -d "%bin%" "%src%\legecy\panda\NumberInWhole.java" "%src%\Main.java"


java -classpath %bin% Main

javap -c -classpath %bin% Main > %docs%\ByteCode.txt

pause


