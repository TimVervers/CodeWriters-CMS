/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.acxdev.codewriters.cmsapi.commands;

import java.util.Map;
import nl.acxdev.codewriters.cmsapi.interfaces.Command;
import nl.acxdev.codewriters.cmsapi.json.JsonCreator;
import nl.acxdev.codewriters.cmsapi.sender.CommandSender;
import org.json.simple.JSONObject;

/**
 *
 * @author absentium
 */
public class Stop implements Command{

    
    public Stop(){
        
    }

    @Override
    public String execute(Map data) {
        JsonCreator creator = new JsonCreator(data);
        JSONObject createdJson = creator.createJson();
        
        CommandSender sender = new CommandSender(createdJson);
        int result = sender.sendData();
        
        String returnText = "";
        
        if(result == 1) {
            returnText += "The container with id " + data.get("cId") + " has been stopped successfully.";
        } else {
            returnText += "The container with id " + data.get("cId") + " could not be stopped.";
        }
        
        return returnText;
    }
}
