package id_start_springboot.start_springboot.presentation.model;

import java.util.Iterator;
import java.util.List;

// イミュータブルなバリューオブジェクト
public class Table implements Iterable<Row> {
    // フィールド
    private List<Row> rows;

    // コンストラクタ
    public Table(List<Row> rows) {
        this.rows = rows;
    }

    @Override
    public Iterator<Row> iterator() {
        return this.rows.iterator();
    }
}
