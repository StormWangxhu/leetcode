package com.wangxiaohu;

import java.util.HashMap;
import java.util.Map;

public class LeetCode567 {

    public static void main(String[] args) {
        String s1 = "ckzviabspcfbabslodcxtzanlsnwbqrozvnfadhtskosxhxaxzwcthvirwivsfuyxgkdvvdmmaoohvnfegkzdajhzibfiuxvsihpseyyiapmgldyojfselzzudzrxcksvfoqoeimyfhnvidryqhhpvjawwpzspcfnvmewnhcbbbwfjifmcuspbrrjyhcusyiuydscwenyicdlfzaoaiudsdyjmhmzwmeaozheiaddevjrrgsfgqnyeoyxfvktctazsfizkynlookeorzmdvtloyfpbqjgzhjvykdthwkuubnbalrddjxpizysaptrinlytecouekkpsfzbjaitckodcdinydtaaakbntwbvrcabylllxtgtkdqfkjggvbrnxnvcsfpcutabvazyeqzitpwhhdpcxaklhbjrcsqzveytzbgoeqnyrbkvkfnlqhrnedjomfmkuadwabnzomgvtdypocbvipryedcxnrcrqwpefqducxxilhpoewlliilidxucjydpahcumngpekrlroftwpbaejfjmohnkulxdglcpcszpyqestonhxskshzmdkikjkeymddyiysmigvqjveocbabhcofwyseytwfgiqmufcqrugwofytxzwwwiwlxdshtamwneosotqbfjjdxmhjkmzcvpmkuumycqzvlmwvjdwkcikyewupwaotrseyomhuykdkohveftgqfoqjcnstlxdasnvimslmuqsqrhvbukyfvpswmlavtxegbcesxgzswwnslxymmrdwmpalcazukvyyotlvwvlishtgbmlznrmcjysjemwqfjgbehnowgjlvtgemlkkdqpxiuqwhqkqdkexoflxfescoblknurkntbpfqfiervqgeiasguycmjoyzyujgzdfjobrswjpxixmadnnkdtazbasmnnlbubokkvomtupdpqwnoddummmqbwbthfhqdgdawdwxlmgvelhefvqcrpxbkgvhyrpxmfivrvkkqfpxjhzqesiqoeanqzpvbgonwptzqgtajoiiphivxtefarwjyoklkxumrndswebdsgiipzrcunpnibmxwlkihnzlswaujflztxxnuhojrpkzldwhnuiizxalawskkvaplopthvzjrbqfwpwjfkzrhyciajdsaeusctnvajuubjiqdqsaqjxtxgxabpdwxzgiedyyeosfdbkairekywkilyksjratftctphompqoomxucysbzrpywjzumoiizklkooilgeapimiixawfgiszfqucihxfrtrwijyeiebudncwnxbnafohhhqaltksafjfegxlbbewetsyrtuxxlngffpcnyfdarqwznsuiuhvqshjpvbiqkxgfwyrkdlorlwgexfinunbfzifxlfufalbkyfdekhupuuflsetpbppaahwbtjpjguygpnavimbbaeikwjxurdxyfgmldgdbkyxzhvwlxzlpnpmzlyosvhngmuqkrvcsabhiahhguxuakphuaptbjfpxybqnlfazkagwlbvzcnzorpymafiwvtkjtilwihwoyelogtpdyipzkurqcghpdqgrfpnmrmahbkbyupxwooblaydongjrlnuhoikoyiexgzlzgonceyhfwypsgypilxcnkdhxvbfddnhvdicolrjyzttrymmcvoyswaszbbugsuuewhewtoxgnrbfqsysjqqcutoikssesxaohxxfxofiguvpgzfkimmqdjuyljlpndapzygidopwxnaetmmpyaqozybbpfqlonebiilvckmtyaommksfcrmdeyjjbjncmpruofaaccnvndkovjugcrzcwkbdhqdiwnvnavnngloshyataygyukrecamzftmeephucmofjgrzsexsprpdkazhmtaepqppgzjmxxzlpbkouqlhqcxdpaslrjrsnfbjvbekpyqsldzhxarpzbbjteudfwfjdipgcdwylorxivwbjkegazpcngzkokygjfnmfeumbetznsxsmyhccurqdzznvhrtawpklrrrbedqzkiczignlaoaiydezgktdecaxwxxecymbuisvhlcjlhmnpjuegnaawfxopvvkxihehquxzlveabigomeptsqbfurytjikpbtsotgfghadilylnimxcsvgtmzjgxjyhabtfawzmomctquctwnolglflghdugeutgdmkitunbkhgoceqyrzvwprotiysaiqcnwxflcjgjqobeskizjqqwihnmxyvbeeufyvouupnyuuyauxtmhtqlbgoacjdkvmuqohbkpctfwxvwlghevsuozrgxkrrrllnvjloeligxvnvzluxlajszgeilxdjaviawhlthtxuclqypgdiwgwrhynmzqghyzeednlmyepgxxvtmjsuprisbgyvcojhculwdkjmpmvueaftiujrmdqptrmlrwdyjtjlznuhftzmffbcqsjemrpjrqxtuxhlnqvckgcuvhswgtxonfljjwnexdafpjzwjdypdfwhwogikkpsvuckmgehcqmdecriamdqsdsxuhsdqenrpifzjnpvrbpvetatbmvsncltabzspzedumeclbxiqnsmdkbqfedikoalfsnxkhewwzyeqxlecfimvdpxdnvrtlxlxzakupknvchursvilyjyfxmvdeojclhjjwxtpqiogsfdnzchrlztvxmibbociiberaevpjmyqxvcicxuwkmyjlgxhvrjdqbjzdctzwidoplkvazhgsdbkavmrpfjgebydmloykqtxocdhcpwrtvawhofvwnohtwodppmcrbhvrvexzijiwgkptntyljvikjlzpjvpxaejfwzyldxrckbzylvhpqmjjeyatmrbcgozvcalcctngwuysjqmkmhjwmyyfxhdjswimahqzptrphtjekkabpgopfdnhwaclxzavftmswadgztxceonrkczurtdvxhabiafyzdbdbyorerekjzgpueihiamlscdndjjgqwdjsmeweqrfpypfrfsciclvrrqchnmtxscbvbbipzingkeopuvlnpqaeqidlpvusbkjhntvxbookqctymjmhqjvsnaiblmnofxphanpxspmkmxmyejooqpytdixgguonbpaipurpwwfqxrrtekvvtpgndabbvjcoxonxciuypxqcfolxirvafnmgsrcrenwyuxfekuqyfdtvhvmonvkstbmvygsbguiknltpixsebxktczniurulxpyxckrtmhpvgqpbvlqwvcqwaocalqtdwomgrjyvryodeikbeeebcrrkugliqgktoohsneynmfafykpmndfgwtpdwfrmicenyntbfyyntlqqrujfioycrhopgiadmsjcycucyuqvzufbvachmlwyfxspzrvkkvkhuykoqrwshzmyypmvosuezpsgtqtecayj";
        String s2 = "livsugnixbcmmajhinduvzfjzxtzneixibupxfezifaovcbowfayjtlcdsjogjytuczxbwluiktkdyecquebuvkgfobhpiqfbyckfbchvfkdowckrvuiblhbmubugrrovdhbyvevwetlusthiyxgtaqcdfytgbkrnnjifdslzntgnryqcmwkumdvqctymyffanmawobfihsfqmtqvivvouunsexpzcfmiituppwxgjyspyoeuspyystyneoonatbojiufzhhfeakqzeypaopkyscadbkzsnnjewgflysazhwaigicrzeccanemfmrvrdzxtcbuqvjblrynlhbmtkzhtiqnhrfclxovtijwucgvsreirqmhweoazxdyydksrchvizmljhdkekaxbqkleaolqnepijxpwbcxfadfsxswhzmmffsmoiyfosbwjjcgqpexddwizaiqpsaagwxkajdhqeyouihwlfrmnelakembxwcrvwqyaguvqewjczfmfqiqmjbqxcmfrpqoewszkomwckfgrlkannjefxsulbpkpxlvbrgwruvhdonuezoomvnyridrosfzhfvhmqbzdsfvjgfdqvafheuhveaqwrofhgkfobkkevdsqyumzrvapfjypvjsdzaxxwcnsbxasqewmkmucxbgjqntdsvrbndebttkoiznatcjgtgklljurkkdvpbrtbolvgrqwsnuoubhgvtmbakwgvxypndpqtireuvbdxfjcioqqsbfrqahqsfbwfnlkwobnqdbptxrizourrxyjejflgkbcwmrtttqeeqkyzrzdcfakwcfajhjfmcpnsbekwtzgpbwrotgsxopaemsnywoxsqxoyricgosfurfggulchgyoocivnkqytgbroijmaduoywbudtgwugekikebdadoygtmikcficifdcsvritesbvznlbrgbveudwzatarhbehowrrakimocgqyxzedhlqxzxtqloupbwbdvewcbehkmoahoykouhilivtxukqhwmyjjqmfxqybahsubfvnhctudtpxwsnwfmsamavjkqiabzzcqgqssygswavqpdtxfyognqybsogsbkzkktfjqebhitvqnawokacbkfkthqoammdscyvxgaaqyaplexhlwweambfwtylvihpdedshaeluxgthrejkgkvwrtyzpuygqghtlkmpnzkyjiwyuaqijkxttvdsxddfkmgnnlmamjumsbjmjxqkrgncrwyoyetdsmtanoasirkfklcsxukfdebnlbgobwgyqrthzwjbwpxuxmheplqyjaucgrptfewjahejsfypktnpafmlrzekbjqsgthrwbdxttitsqyglsjgnzmscncgvkooxdlxsmmugeeayicndgoagpfckerzuwdphqksijniyckzviabspcfbabslodcxtzanlsnwbqrozvnfadhtskosxhxaxzwcthvirwivsfuyxgkdvvdmmaoohvnfegkzdajhzibfiuxvsihpseyyiapmgldyojfselzzudzrxcksvfoqoeimyfhnvidryqhhpvjawwpzspcfnvmewnhcbbbwfjifmcuspbrrjyhcusyiuydscwenyicdlfznoaiudsdyjmcmzwmeaozheiaddevjrrgsfgqnyeoyxfvktctazsfizkynlookeorzmdvtloyfpbqjgzhjvykdthwkuubnbalrddjxpihysaptrinlytecouekkpsfzbjaitckodcdinydtaaakbntwbvrcasylllxtgtkdqfkjggvbanxnvcsfphutabvazyeqzitpwhhdpcxaklhbjrcsqzveytzbgoeqnyrbkvkfnlqhrnedjomfmkuadwabnzomgvtdypocbvipryedcxnrcrqwpefqducxxilhpoewlliilidxucjydpahcumagpekrlroftwpbaejfjmohnkulxdglcpcszpyqestonhxskshzmdkikjkeymdfyiysmigvqjveocbabhcofwyseytwfgiqmufcqrugwofytxzwwwiwlxdshtamwneosotqbfjjdxmhjkmzcvpmkuumycqzvlmwvjdwkcityewupwaotrseyomhuykdkohveftgqfoqjcnstlxdasnvimslmuqsqrhvbukyfvpswmlavtxegbcesxgzswwnslxymmrdwmpalcazukvyyotlvwvlishtgbmlznrmcjysjemwqfjgbehnowgjlvtgemlkkdqpxiuqwhqkqdkexoflxfescoblknurkntbpfqfiervqgeiesguycmjoyzyujgzdfjobrswjpxixmadnnkdtazbasmnnlbubokkvomtupdpqwnoddummmqbwbthfhqdgdawdwxlmgvelhefvqcrpxbkgvhyrpxmfivrvkkqfpxjhzqesiqoeanqzpvbgonwptzqgtajoiiphivxtefarwjyoklkxumrndswebdsghipzrcunpnibmxwlkihnzlswaujflztxxnuhojrpkzldwhnuiizxalawskkvaplopthvzjrbqfwpwjfkzrhyciajdsaeusctnvajuubjiqdqsaqjxtxgxabpdwxzgiedyyeosfdbkrirekywkilyksjratftctphompqoomxucysbzrpywjzumoiizklkooilgeapimiixawfgiszfqucihxfrtrwijyeiebudncwnxbnafohhhqaltksafjfegxlbbewetsyrtuxxlngffpcnyfdarqwznsuiuhvqshjpvbiqkxgfwyrkdlorlwgexfinunbfzifxlfufalbkyddekhupuuflsetpbppaahwbkjpjguygpnavimbbaeikwjxurdxyfgmldgdbkyxzhvwlxzlpnpmzlyosvhngmuqkrvcsabhiahhguxuakphuaptbjfpxybqnlfazkagwlbvzcnzorpymafiwvtkjtilwihwoyelogtpdyipzkurqcghpdqgrfpnmrmahbkbyupxwooblaydongjrlnuhoikoyiexgzlzgonceyhfwypsgypilxcnkdhxvbfddnhvdicolrjyzttrymmcvoyswaszbbugsuuewhawtoxgnrbfqsysjqqcutoikssesxaohxxfxofiguvpgzfkimmqdjuyljlpndapzygidopwxnaetmmpyaqozybbpfqlonebiilvckmtyaommksfcrmdeyjjbjncmpruofaaccnvndkovjugcrzcwkbdhqdiwnvnavnngloshyataygyukrecamzftmeephucmofjgrzsepsprpdkazhmtaepqppgzjmxxzlpbkouqlhqcxdpaslrjrsnfbjvbekpyqsldzhxarpzbbjteudfwfjdipgcdwylorxivwbjkegazpcngzkokygjfnmfeumbetznsxsmyhccurqdzznvhrtawpklrrrbedqzkiczignlaoaiydezgktdecaxwxxecymbuisvhlcjlhmnpjuegnaawfxopvvkxihehquxzlveabigomeptsqbfurytjikpbtsotgfghadilylnimxcsvgtmzjgxjyhabtfawzmomctquctwnolglflghdugeutgdmkitunbkhgoceqyrzvwprotiysaiqcnwnflcjgjqobeskizjqqwihnmxyvbeeufyvouupnyuuyauxtmhtqlbgoacjdkvmuqohbkpctfwxvwlgievsuozrgxkrrrllnvjloeligxvnvzluxlajszgeilxdjaviawhlthtxuclqypgdiwgwrhynmzqghyzeednlmyepgxxvtmjsuprisbgyvcojhculwdkjmpmvueaftiujrmdqptrmlrwdyjtjlznuhftzmffbcqsjemrpjrqxtuxhlnqvckgcuvhswgtxonfljjwnexdafpjzwjdypdfwhwogikkpsvuckmgehcqmdecriamdqsdsxuhsdqenrpifzjnpvrbpvetatbmvsncltabzspzedumeclbxiqnsmdkbqfedikoalfsnxkhewwzyeqxlecfimvdpxdnvrtlxlxzakupknvchursvilyjyfxmvdfojclhjjwxtpqiogsfdxzczrlztvxmibbociiberaevpjmyqxvcicxuwkmyjlgxhvrjdqbjzdctzwidoplkvazhgsdbkavmrpfjgebydmloykqtxocdhcpwrtvawhofvwnohtwodxpmcrbhvrvexzijiwgkptntyljvikjlzpjvpxaejfwzyldxrckbzylvhpqmjjeyatmrbcgozvcalcctngwuysjqmkmhjwmyyfxhdjswimahqzptrphtjekkabpgopfdnhwaclxzavftmswadgztxceonrkczurtdvxhabiafyzdbdbyorerekjzgpueihiamlscdndjjgqwdjsmeweqrfpypfrfsciclvrrqchnmtxscbvbbipzingkeopuvlnpqaeqidlpvusbkjhntvxbookqctymjmhqjvsnaiblmnofxphanpxspmkmxmyejooqpytdixgguonbpaipurpwwfqxrrtekvvtpgndabbvjcoxonxciuypxqcfolxirvafnmgsrcrenwyuxeekuqyfdtvhvmonvkbtbmvygsbguiknltpixsebxktczniurulxpyxckrtmhpvgqpbvlqwvcqwaocalqtdwomgrjyvryodeikbeeebcrrkugliqgktoohsneynmfafykpmndfgwtpdwfrmicenyntbfyyntlqqrujfioycrhopgiadmsjcycucyuqvzufbvachmlwyfxspzrvkkvkhuykoqrwshzmyypmvosuezpsgtqtecayjdasrysrmdewxmqntqmuavczczrcrzokjzqtiucdfmijfqkizfftxsddkdwlofkjbuhzodgzeslpezdifpdfktufgekrrbsxfeqduphoemwhncbblqkoyychuwlkjfxjmvdasfhwxnxjmstabgiujditpmpnojsfzpgqvupkdipphutiewfynvoxmdaloyxsksaxnyyizreshgejskhokarxddrrkoeglwledovrbarhkfcetrshiuucmbrtqjawsavbhuoijshkzcmogbjurybhwduushlmhjzgthhlvftpytayjzzbcxbtvozwhsmtkltgrugyfaoldnnswbohpsqvwbwtjcxeewsvfwpkwltxmomlwsylwvcmmrwjvvbbktqxnypfmhjigzaqacmprjfnooinkgbjzzwyuafxsmqdcmsxhbfoejjzxizufvfejrrcfaijqovlxdngkgwisvryevivawbcttftuxympktxbxotvdycxhfokmtdeqacdceffvhvjpnzfuhqslixvlcxehvbkritokoqqlbmkdkgflthhhdgiaidjjpvcatctiosolfqzcjmdppttztpklgosnshspna";
        System.out.println(checkInclusion(s1, s2));
    }

    /**
     * 题目描述：给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。如果是，返回 true ；否则，返回 false 。
     * https://labuladong.gitee.io/algo/1/9/
     *
     * @param s1
     * @param s2
     * @return
     */
    public static boolean checkInclusion(String s1, String s2) {
        // 窗口中存放的是符合条件的连续的字符
        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        for (int i = 0; i < chars1.length; i++) {
            need.put(chars1[i], need.getOrDefault(chars1[i], 0) + 1);
        }

        // 左右指针
        int left = 0, right = 0;
        // 标记 need 哈希表中的字符个数，即有多少种字符
        int valid = 0;
        // 区间是左闭右开[left,right)
        while (right < chars2.length) {
            // c是将移入窗口的字符
            char c = chars2[right];
            // 窗口右移
            right++;
            // 进行窗口内的一系列数据更新
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }

            // 判断左侧窗口是收缩
            while (right - left >= chars1.length) {
                //当我们发现某个字符在 window 的数量满足了 need 的需要，就要更新 valid，表示有一个字符已经满足要求。
                // 而且，你能发现，两次对窗口内数据的更新操作是完全对称的。
                if (valid == need.size()) {
                    return true;
                }
                // 将要移除的字符
                char d = chars2[left];
                // 窗口左移
                left++;
                // 进行窗口内的一系列数据更新
                if (need.containsKey(d)) {
                    //
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.getOrDefault(d, 0) - 1);
                }
            }
        }
        return false;
    }

}
