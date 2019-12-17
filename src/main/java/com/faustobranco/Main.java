package com.faustobranco;

import com.faustobranco.model.user_contact;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.faustobranco.model.user_missing;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        // Load simple Json and Array Json into JsonNode Object
        System.out.println ("Json to JsonNode Object: \n");
        ObjectMapper mapper = new ObjectMapper();
        //JsonNode rootArray = mapper.readTree(new File ("src/main/resources/contact_array.json"));
        JsonNode rootArray = mapper.readTree(new File ("src/main/resources/contact.json"));
        if (rootArray.isArray ()) {
            for (JsonNode root : rootArray) {
                System.out.println (root.path ("name").path ("last"));

                JsonNode contactNode = root.path ("contact");
                if (contactNode.isArray ()) {
                    for (JsonNode node : contactNode) {
                        String type = node.path ("type").asText ();
                        String ref = node.path ("ref").asText ();
                        System.out.println ("type : " + type);
                        System.out.println ("ref : " + ref);

                    }
                }
            }
        } else {

            System.out.println (rootArray.path ("name").path ("last"));

            JsonNode contactNode = rootArray.path ("contact");
            if (contactNode.isArray ()) {
                for (JsonNode node : contactNode) {
                    String type = node.path ("type").asText ();
                    String ref = node.path ("ref").asText ();
                    System.out.println ("type : " + type);
                    System.out.println ("ref : " + ref);

                }
            }
        }

        // Load simple Json and Array Json into immutable class
        System.out.println ("\nJson to immutable Class: \n");

        ObjectMapper mapper_class = new ObjectMapper();
        JsonNode rootArray_class = mapper_class.readTree(new File ("src/main/resources/contact_array.json"));
        //JsonNode rootArray_class = mapper_class.readTree(new File ("src/main/resources/contact.json"));
        List<user_contact> lst_user = new ArrayList<> ();

        if (rootArray_class.isArray ()) {
            for (JsonNode root : rootArray_class) {
                user_contact json_UserContact = mapper_class.treeToValue (root, user_contact.class);
                lst_user.add (json_UserContact);
            }
        } else {
            user_contact json_UserContact = mapper_class.treeToValue (rootArray_class, user_contact.class);
            lst_user.add (json_UserContact);

        }
        System.out.println (lst_user.toString ());

        for (user_contact row_usercontact : lst_user) {
            System.out.println (row_usercontact);
        }

        // Load Json file with properties that not exist into class
        System.out.println ("\nLoad Json file with properties that not exist into class: \n");

        ObjectMapper mapper_missing_class = new ObjectMapper();
        JsonNode rootArray_missing_class = mapper_missing_class.readTree(new File ("src/main/resources/contact_missing.json"));

        user_missing json_UserContact = mapper_class.treeToValue (rootArray_missing_class, user_missing.class);

        System.out.println (json_UserContact);

    }
}
