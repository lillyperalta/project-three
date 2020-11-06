# The main class is FlightApplication.
run: compile
	java FlightApplication

compile:
	javac -cp junit5.jar *.java

test:
	java -jar junit5.jar --scan-classpath --details tree

clean:
	$(RM) *.class
