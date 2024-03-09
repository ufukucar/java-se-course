package com.ufukucar.tasit;

import com.ufukucar.kurallar.Kanun;
import com.ufukucar.base.Arac;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)

public class Bisiklet extends Arac  implements Kanun {


    @Override
    public int hisSiniri() {
        return 30;
    }

    @Override
    public String bakimDurumu() {
        return "Mart ayında";
    }

    @Override
    public int tasitVerigis() {
        return 0;
    }
}
