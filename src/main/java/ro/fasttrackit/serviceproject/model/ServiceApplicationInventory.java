package ro.fasttrackit.serviceproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceApplicationInventory {
    @Id
    @GeneratedValue
    private Long id;

    private int codprodus;

    private String sisteminformatic;
    private String marca;
    private String numarInventar;
    private String tipNrInventarl//        public string MARCA { get; set; }
//        public string NRINV { get; set; }
//        public string TIPNRINV { get; set; }
//        public string SERIEPRODUS { get; set; }
//        public Nullable<System.DateTime> DATAACHIZITIEI { get; set; }
//        public Nullable<short> AMORTIZARE { get; set; }
//        public int CODPARINTE { get; set; }
//        public string CARACTERISTICI { get; set; }
//        public Nullable<short> UPGRADE { get; set; }
//        public Nullable<short> NOU { get; set; }
//        public string NRFACTURA { get; set; }
//        public short CASAT { get; set; }
//        public Nullable<short> MAGAZIE { get; set; }
//        public string CENTRUZONAL { get; set; }
//        public string SCRISADE { get; set; }
//        public Nullable<short> DEREPARAT { get; set; }
//        public Nullable<decimal> VALOAREDEINV { get; set; }
//        public string OBS { get; set; }
//        public string FURNIZOR { get; set; }
//        public Nullable<int> GARANTIE { get; set; }
//        public Nullable<decimal> TVA { get; set; }
}
