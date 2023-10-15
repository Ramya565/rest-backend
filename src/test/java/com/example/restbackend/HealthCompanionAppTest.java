package com.example.restbackend;

import model.HealthCompanionApp;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.jupiter.api.Assertions.*;
@RestController

class HealthCompanionAppTest {
    @Test
    public void testGettersAndSetters() {
        // Create a HealthCompanionApp object
        HealthCompanionApp app = new HealthCompanionApp(
                "Symptom Detection", "Prevention Over Intervention", "Ayurvedic Practices",
                "Personalized Guidance", "Self Advocacy", "Diet and Exercise Plans",
                "Motivational Content", "Education", "Comprehensive Knowledge", "Holistic Approach"
        );

        // Test the getters
        assertEquals("Symptom Detection", app.getEarlySymptomDetection());
        assertEquals("Prevention Over Intervention", app.getPreventionOverIntervention());
        assertEquals("Ayurvedic Practices", app.getAyurvedicPractices());
        assertEquals("Personalized Guidance", app.getPersonalizedGuidance());
        assertEquals("Self Advocacy", app.getSelfAdvocacy());
        assertEquals("Diet and Exercise Plans", app.getDietAndExercisePlans());
        assertEquals("Motivational Content", app.getMotivationalContent());
        assertEquals("Education", app.getEducation());
        assertEquals("Comprehensive Knowledge", app.getComprehensiveKnowledge());
        assertEquals("Holistic Approach", app.getHolisticApproach());

        // Test the setters
        app.setEarlySymptomDetection("New Symptom Detection");
        app.setPreventionOverIntervention("New Prevention Over Intervention");
        app.setAyurvedicPractices("New Ayurvedic Practices");
        app.setPersonalizedGuidance("New Personalized Guidance");
        app.setSelfAdvocacy("New Self Advocacy");
        app.setDietAndExercisePlans("New Diet and Exercise Plans");
        app.setMotivationalContent("New Motivational Content");
        app.setEducation("New Education");
        app.setComprehensiveKnowledge("New Comprehensive Knowledge");
        app.setHolisticApproach("New Holistic Approach");

        assertEquals("New Symptom Detection", app.getEarlySymptomDetection());
        assertEquals("New Prevention Over Intervention", app.getPreventionOverIntervention());
        assertEquals("New Ayurvedic Practices", app.getAyurvedicPractices());
        assertEquals("New Personalized Guidance", app.getPersonalizedGuidance());
        assertEquals("New Self Advocacy", app.getSelfAdvocacy());
        assertEquals("New Diet and Exercise Plans", app.getDietAndExercisePlans());
        assertEquals("New Motivational Content", app.getMotivationalContent());
        assertEquals("New Education", app.getEducation());
        assertEquals("New Comprehensive Knowledge", app.getComprehensiveKnowledge());
        assertEquals("New Holistic Approach", app.getHolisticApproach());
    }
}

