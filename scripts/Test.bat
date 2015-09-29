@echo off
set workspace=C:\Users\SANDRA\Desktop\Practicas master\SPAI\Workspace\Sandra.Chacon.ecp1.miw.upm.es
set PATH=%PATH%C:\Users\SANDRA\Desktop\Software Master\apache-maven-3.3.3\bin;C:\Program Files\Java\jdk1.8.0_60\bin
set M2_HOME=C:\Users\SANDRA\Desktop\Software Master\apache-maven-3.3.3
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_60
echo -----------------------------------------------------------------


cd %workspace%

echo ============ mvn clean test (profile: develop) =================================================

call mvn clean test

pause

echo ============ mvn test (profile: develop) =======================================================

call mvn test -Denvironment.type=develop


pause