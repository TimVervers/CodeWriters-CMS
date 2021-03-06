/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.acxdev.codewriters.cmsapi.factory;

import nl.acxdev.codewriters.cmsapi.interfaces.Command;
import nl.acxdev.codewriters.cmsapi.commands.*;

/**
 *
 * @author absentium
 */
public class CommandFactory {
    
    public Command getCommand(String commandType){
        if(commandType == null){
            return null;
        }
        switch(commandType){
            case "start":
                return new Start();
            case "stop":
                return new Stop();
            case "rename":
                return new Rename();
            case "remove":
                return new Remove();
            case "move":
                return new Move();
            case "create":
                return new Create();
        }
        
        return null;
    }
    
}
