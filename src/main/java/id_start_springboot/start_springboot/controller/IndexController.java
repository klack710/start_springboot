package id_start_springboot.start_springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        String h1 = "Hello World";

        List<String> items = new ArrayList<String>();
        items.add("apple");
        items.add("orange");
        items.add("grape");

        final int max_row = 5;
        final int max_column = 10;

        // tableを作成
        List<List<String>> table = new ArrayList<List<String>>();
        ArrayList<String> th_row = new ArrayList<String>();
        // thとなるヘッドの列作成
        for (int i = 0; i < max_column; i++) {
            th_row.add("th" + i);
        }
        // tdとなる列作成
        for (int i = 0; i < max_row; i++) {
            ArrayList<String> row = new ArrayList<String>();
            for (int j = 0; j < max_column; j++) {
                row.add("{r:" + i + " c:" + j + "}");
            }
            table.add(row);
        }

        model.addAttribute("h1", h1);
        model.addAttribute("items", items);
        model.addAttribute("th_row", th_row);
        model.addAttribute("table", table);
        return "index";
    }
}