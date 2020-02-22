package id_start_springboot.start_springboot.presentation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import id_start_springboot.start_springboot.presentation.model.Cell;
import id_start_springboot.start_springboot.presentation.model.Row;
import id_start_springboot.start_springboot.presentation.model.Table;

@Controller
public class IndexController {
    private static final int MAX_ROW = 5;
    private static final int MAX_COLUMN = 10;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        String h1 = "Hello World";

        List<String> items = new ArrayList<String>();
        items.add("apple");
        items.add("orange");
        items.add("grape");

        // tableを作成
        ArrayList<String> th_row = new ArrayList<String>();
        // thとなるヘッドの列作成
        for (int i = 0; i < MAX_COLUMN; i++) {
            th_row.add("th" + i);
        }

        model.addAttribute("h1", h1);
        model.addAttribute("items", items);
        model.addAttribute("th_row", th_row);
        return "index";
    }

    @ModelAttribute("table")
    private Table generateTable() {
        List<Row> rows = new ArrayList<>();
        for (int i = 0; i < MAX_ROW; i++) {
            List<Cell> cells = new ArrayList<>();
            for (int j = 0; j < MAX_COLUMN; j++) {
                cells.add(new Cell(i, j));
            }
            rows.add(new Row(cells));
        }
        return new Table(rows);
    }
}
