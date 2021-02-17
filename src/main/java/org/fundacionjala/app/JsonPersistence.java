package org.fundacionjala.app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.fundacionjala.app.quizz.model.QuizAnswers;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonReader;

public class JsonPersistence {
	public static void saveQuiz(QuizAnswers AnswerQuizz) {
		Gson gson=new Gson();
		String titleQuiz=AnswerQuizz.getQuiz().getTitle();
		try (Writer writer=new FileWriter("./"+titleQuiz+".json")){
			gson.toJson(AnswerQuizz, writer);
			
		} catch (JsonIOException | IOException exception) {
			exception.printStackTrace();
		}
	}
	public static QuizAnswers readQuiz(String name) {
		Gson gson = new Gson();
        QuizAnswers quizAnswers = null;
        try (JsonReader reader = new JsonReader(new FileReader("./"+name))) {
            quizAnswers = gson.fromJson(reader, QuizAnswers.class);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return quizAnswers;
	}
	
	
	
	
	
	
    public static void main(String[] args) {
        Person person = new Person("Elon", "Musk", 49);
        writeJsonFile(person);

        Person parsedPerson = readJsonFile();
        System.out.println(parsedPerson);
    }

    private static Person readJsonFile() {
        Gson gson = new Gson();
        Person person = null;
        try (JsonReader reader = new JsonReader(new FileReader("./myForm.json"))) {
            person = gson.fromJson(reader, Person.class);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return person;
    }

    public static void writeJsonFile(Person person) {
        Gson gson = new Gson();
        try (Writer writer = new FileWriter("./myForm.json")) {
            gson.toJson(person, writer);
        } catch (JsonIOException | IOException exception) {
            exception.printStackTrace();
        }
    }

    public static class Person {
        private final String name;
        private final String lastName;
        private final int age;

        public Person(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return getName() + " " + getLastName() + " : " + getAge();
        }
    }
}
