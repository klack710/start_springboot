package id_start_springboot.start_springboot.presentation.model;

// イミュータブルなバリューオブジェクト
public class Cell {
    // フィールド
    private String value;

    // コンストラクタ
    public Cell(int rowIndex, int columnIndex) {
        this.value = "{r:" + rowIndex + " c:" + columnIndex + "}";
    }

    @Override
    public String toString() {
        return this.value;
    }
}
