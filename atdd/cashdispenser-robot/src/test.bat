@echo off

REM if %1!==! goto usageManual

set INITIAL_CLASSPATH=%CLASSPATH%	

for /R ./lib %%a in (*.jar) do call :addToClasspath %%a

echo CLASSPATH is: %CLASSPATH%;

REM @call jybot -d output %1
@call jybot -b debug.txt -d output *
goto revert


:addToClasspath
set CLASSPATH=%1;%CLASSPATH%
goto :EOF

:usageManual
echo Usage: run.bat testcase
echo testcase - testcase HTML file to run

:revert
set CLASSPATH=%INITIAL_CLASSPATH%