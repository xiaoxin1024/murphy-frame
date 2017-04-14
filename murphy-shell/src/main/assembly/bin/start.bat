@echo off & setlocal enabledelayedexpansion

java -Xms1024m -Xmx1024m -XX:MaxPermSize=256M -classpath .\config; -jar ./murphy-shell-1.0.0.jar

@pause