FROM gradle:jdk11-openj9

WORKDIR /app

COPY . .

RUN ["gradle","clean"]

RUN ["gradle","build"]

ENV TEST_ARG=huas

CMD ["java", "-jar", "build/libs/beanstalkstudy-0.0.1-SNAPSHOT.jar", "--test.test=${TEST_ARG}"]



