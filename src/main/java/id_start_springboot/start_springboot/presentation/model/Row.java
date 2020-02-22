package id_start_springboot.start_springboot.presentation.model;

import java.util.Iterator;
import java.util.List;

// イミュータブルなバリューオブジェクト
public class Row implements Iterable<Cell> {
    // フィールド
    private List<Cell> row;

    // コンストラクタ
    public Row(List<Cell> row) {
        this.row = row;
    }

    @Override
    public Iterator<Cell> iterator() {
        return this.row.iterator();
    }
}
