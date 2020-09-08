package com.tjgwebservices;

import static spark.Spark.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

import java.net.URI;
import java.net.URISyntaxException;

import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;

public class Main {
    public static void main(String[] args) {


    get("/", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Index Page");

            return new ModelAndView(attributes, "research.ftl");
        }, new FreeMarkerEngine());

    get("/research", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Research Methods");

            return new ModelAndView(attributes, "research.ftl");
        }, new FreeMarkerEngine());

    get("/researchImpedance", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Impedance");

            return new ModelAndView(attributes, "impedance.ftl");
        }, new FreeMarkerEngine());

    get("/researchInteraction", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Interaction");

            return new ModelAndView(attributes, "interaction.ftl");
        }, new FreeMarkerEngine());

    get("/researchSecurity", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Security Management");

            return new ModelAndView(attributes, "security.ftl");
        }, new FreeMarkerEngine());

    get("/researchInteraction", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Interaction");

            return new ModelAndView(attributes, "interaction.ftl");
        }, new FreeMarkerEngine());

    get("/researchSecurity", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Security Management");

            return new ModelAndView(attributes, "security.ftl");
        }, new FreeMarkerEngine());

    get("/researchResources", (req, res) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Resource Management");

            return new ModelAndView(attributes, "resources.ftl");
        }, new FreeMarkerEngine());




        get("/test", (req, res) -> "Test");
    }
}
