//Author: ZhuRuoLing

import java.io.File
import java.util.regex.Pattern

val pattern = Pattern.compile("%NGSX%\"([A-Za-z0-9]+)=(.+)\"")

val order = "%UTItfWFdhj%%QcOOHYmtTo%%EGhfPauqCX%%VzdtCqwJWK%%yFnAtBjvOg%%IuMEtoMCDe%%BoBknqYvlq%%CDwiQYtGMo%%QZCvoAMzZo%%ETfRjjecmc%%COkxDfXDOu%%VfQpoCMfWN%%DzvXLJxEZG%%UqtKMcOfRi%%CjLFszdQDG%%wYgzydsnLU%%ItDhzFLfDm%%NHnNkuOQEm%%GGbtjVjUlI%%JBtXAjFDfN%%NXnrSPLtpe%%oCIynbrkXD%%vRUUCmnpma%%PkKRzJtJAu%%kQFhuhTVJy%%RuFBrVcsPG%%BvgopeRQYE%%HIJDtFmNAv%%ssGNiuEjAE%%GbUUSPJqRp%%pdWfRjLciM%%JpSunjOsfV%%zIquYGNOKD%%VVVkfpwBWZ%%ICaNUqjAHJ%%aqkWQHNBgk%%vWrERNuHoY%%MnwgmXICzH%%xnhbDELYuy%%CVuLDMkvWh%%WBlIWMUeKS%%ZkbzNhPqbm%%cvnQwRTKCA%%MmFsKWcyeQ%%JHoBzrTVYv%%WTtJfBovmf%%TjBkgMEJOR%%fqmlDvhLrf%%XYLgDTSWmj%%HGmYWzfevM%%MkghqGGigK%%uCdhiVyuGm%%UIwFjydopd%%pcqEsMREQW%%mKQBPfDeQa%%bLxiSdOAYR%%CsTcvrmyOv%%dTDKZjRUQd%%VYxobEFhMo%%YqGZtURNgx%%TequXhhNjI%%mTKUVEVEbR%%MeMzxMnEqf%%seOskRIcrT%%wRYdceGLdP%%ZmLpLOrQXk%%UDwephesJe%%VSniuUgIxs%%gBAAggszHw%%zSfgZTvTOU%%ZocZUgYDVR%%HJtEdscVYi%%PFKmFcNgiA%%zmUCsSzAGZ%%hOEQOQzAcG%%QzVFftDPuR%%tSuusuOQll%%TBpYbabUxP%%DmdCJZqpwY%%oJgPFptjxu%%bIoRNokXEe%%sJrEnhOSLs%%dzumXjvztL%%HSwdNUXmOu%%PtLrGFrBBy%%AAyfqBobTE%%TKDSxzmoQs%%jCeqDJOcGr%%RTXVkgurMl%%GVsjAeQSUg%%tdLioYvhCG%%NmvBNaNIIq%%fVBFMnjUPy%%TWhzYNiOGm%%KmOgyuzQwA%%rikDbxCgwb%%PBrdNReWDZ%%SYbwGSgvgs%%NsyphLLExB%%lcsExjVLsG%%pDnxHsgOWj%%rhZeowcbVc%%fAzcOQGwZw%%WuczckfbHO%%EXHojecnqa%%gTQqBPelJR%%MJOAmWezcd%%rbugxhSkSJ%%NsgYpdEMYm%%gTsQbVjhcm%%ZDlmJfzJSt%%WTtZeuDQki%%ssAPXxIEfC%%YLiFJkhTok%%EVTEpmAtMH%%rsXTUHcvom%%wVEpulLNpT%%nJBZEwyWzL%%WpSxkGOoLc%%hLEcNJrEje%%BNdSuIQXpx%%jgVDphdgeO%%wwcnMBezmV%%fUMvjjmZdC%%PQZnTbPbNG%%GkzvHfLQfS%%DrKurouAuf%%UdcCZFxOuK%%LdMGoVuqNe%%ywTkZygEVE%%HpGHLDhXwb%%HWvvhzEefw%%TdNpGyjSCA%%zSTPdwweVL%%NxULwCaydz%%TbzyKEBram%%tpuVCPdFsL%%cAjtJwicTe%%yKPdGxtufy%%UfdIrydYiH%%zufrwtSfPo%%vzxWOJzrpe%%wIATQXwAbl%%skTmFdExGm%%FnFQdvHhUI%%YLJelQUmAz%%XseDVlFlqL%%ecLcyicJPv%%poGsnHAObO%%isWgonjbVS%%PwRjEWaGFc%%NkwfjJMLqo%%KRkBCMfEOl%%ZaOXGTwwOr%%GUiYaYVRXF%%ByLGiYmpHR%%QwStdMwzyq%%mpWYIPIlBE%%QnHiKAphPI%%HhPWAjcOVn%%BwtGtmBMYs%%paOdbDPJJC%%xoJQIezayy%%MTpncuTaPy%%ZCjwsGtMVW%%utftQmMDXo%%MBoAFwKBaH%%JPTkCVfnxc%%LMeBdtNWxP%%HqcBLyoJQV%%WRMomFzUQU%%hzfVCawMwm%%JNekZtMsze%%HwwBgUaQoy%%TSgCIilgZK%%bBnEmiNBoT%%ShvLnLcDPH%%aFxXsQHBCR%%iGsOcfiRoX%%gyCvGMwvoX%%fHrrKvdpmw%%BlZxLlOHIh%%CloRACdcrF%%tlmELApadH%%bTFSwVyeJu%%XPMhvUszQi%%sbXGdpYuLk%%WODbfIGwuF%%dYsWIDzfjR%%hPjVoaVYPh%%WdtzxjmKbM%%oWelftJbYz%%PSlUchEHMf%%MHGnIZFTzz%%rPewDlKYQV%%rUZprdSzwq%%EEXVZGpRCg%%NQBzhaOOqR%%xGRROSHqVE%%ggwiUNRixW%%VSvKiBsAir%%pdiETYMghh%%YYWYZHttFt%%iFruWElhJn%%zhiDpdYSpW%%aLbpXWWxLA%%hZVOjJLOHp%%NFwTHRQsIW%%JAdJswEbwa%%HNwifAmtuF%%rkkaivohIg%%fEOORGWmvM%%fKrHHZjoOh%%FwXdEzqcAX%%hwtqUcZHqy%%EZYHAHSDsj%%lasAAJGLks%%qTLyEIqbNE%%aCXpDFyqDX%%GMKqLhdTPk%%wowYhKnAcR%%rQQNjJcdXV%%lqimLDjvMx%%EwmCiMfYiS%%rYnLGPWWhc%%eaWTZfgkmD%%BSNFnUEoEw%%DdVeDncwFW%%HmnKsDAsCd%%GVMEqykIxM%%lIrLybfRqM%%dJEqWpFdnK%%tmLBQIrqNe%%cuZTLZVBlr%%xJcQZWqvIb%%TguNtZXPUP%%JPdlJIKLFX%%tdRWmKjVBT%%sVIMlWalAM%%cfHwHIFQgr%%mFQKIPoyBI%%PbnaxNgraN%%IykTVnwvoD%%ftOkHMfXdw%%HBKRWaSHZT%%CnQtJOuXPu%%tTjXDvndtK%%IinDfgNtWV%%vOwubSDuBT%%siiJcNsNoB%%MPooltZmoC%%abaUZExOVL%%STBzsAaEAr%%NafuiFAhjI%%SqgYTrhnKy%%qESCJTnOWL%%suLWPZVFLt%%dpFmSBMDGb%%sMUcajiCLp%%sMlypxFkjT%%vBBqvbYFKh%%gJhUsGAJVF%%RtUwardgXu%%WCtNFRlDHZ%%kCSEjIEqfJ%%WVoEbcHfqd%%YSIpkDpupA%%uXcVupApnr%%MManyanPLD%%kfmDbsTDtF%%skbFoZTtjM%%BrSYrlRuQj%%qAJLqpKyUb%%vXVHZCKvZy%%hUGYcSnolP%%ByMkpSAqoZ%%ouyhrEwlZP%%AvvrcvTKIx%%cwnfAWkLrg%%bugZkMwyHy%%wcowogduhU%%YQHRXRhsHu%%tKTSOgovhp%%YvckbZhQRt%%TQDxhkMpct%%FdQnfLjvIh%%RHnSVDNxPX%%JqBoAChvLD%%uYtNKVEPep%%QLiJBmDLCD%%woAfJpCCMC%%ENKfNTnzia%%YYtAgYhRMn%%ZwShggyoeu%%sccCLdbdWI%%ZdCCFxVZYL%%hKQyDhUCYG%%uZvNHWWROd%%WeVeoWTqCI%%kypsnImDYD%%iyfpnZIPVI%%BekVOdPLkH%%oEapwVJczY%%KtSlVyZFQo%%neuUhgnuEk%%TAtrpDyPTr%%qFpWXimZaq%%djVVtkjfip%%IpypfkaAWr%%ZkMzYHOyWZ%%UoungKExYe%%tsGEJahaQN%%hLcIqTwwWL%%vLjjutVkiv%%FCBRXHDiPX%%ANHjRilLWm%%niBmIIjwjp%%fWRvhFklLJ%%poGYlIdasm%%hknVhwaoip%%yhZzSDVmbl%%YaanWZCDba%%EieXhVIWnL%%EVcvkioggI%%MRYgnhjaYi%%UxniLpccsW%%UZZqHcYEcO%%KvxtnNjXJa%%LIXeRgITKV%%gmOjNNRIzl%%iFXkyyaUUX%%fetrlmcUyA%%ufUhIxHnFA%%VByyRgKMGs%%gOYMPbTwXB%%KXkZQdLQCa%%RMotcEGUzf%%BpnftGghrG%%EkpePXrzHO%%vTjGBtzFJl%%uYXSZuJeFk%%XDzVwGwjDe%%nhnLJIgHEa%%gAyfmFnxeu%%nnUxQRtnjU%%XpbEYnLliq%%oczEdwfuJR%%tZejQamPVR%%oSxJdQzThY%%TboOglNptt%%MZEsBXkSNY%%aVqqbwEQBn%%WlnKXsLqcF%%mXwBfpnfif%%FHfjXXLXMJ%%HXNgxBMTvi%%mUPiLdzOlM%%iyHvHpgdMZ%%GOEtXpjpeD%%DuKZTLSWxU%%yWLZBjpryi%%uIhvCypvlv%%TkKHiOOICW%%wjGSBJcESO%%aRRVjVnowv%%wwKbaomdQM%%uGPCLkboUS%%vKDxvctOyn%%BAlgzZzERn%%xZOfttcokY%%TYuEaMSnGY%%VxEDlUvIcL%%LxxHvvWydb%%ZeEzuDgHgN%%glXSsaulTz%%YtlynvANiE%%PujFYQSeiI%%ONCoFzzEpv%%aLEEcGSgmZ%%csyBXMcsUB%%hpclLlRXTN%%VVxNDePFCs%%YMRjFvoaqS%%xhKNoKItSR%%OVnzdgVLXT%%WxPBDuxTFq%%WRGaqOlKzT%%wwMLEczsfy%%ADcxVarjkT%%mPNCUXpmjo%%VklewAKdXA%%UfNhPtOieq%%wczFGHIjQG%%NnjRDprXbv%%pnmKZhbGMB%%ihiSSSLGyP%%RBnqMHVWDA%%bQgJaiQPGy%%FcwpyGeqYK%%ELzlDNaVXr%%lfcmAsaySJ%%cVZakPeYSf%%CFXSWqrVgn%%hURpmzZkOg%%GGyoIIMzbO%%IcdROGhjqj%%aesECidKNK%%PUjLzWhIkn%%ESTrEfQaAG%%rPTEfBnTMz%%FcLqYOTssS%%zyZdFhkaaw%%sdjgsZbEGX%%InWLHBgDtQ%%lyHHhTQQZY%%rmTphBSFYZ%%MpLujlCnve%%aHHklTwBYz%%ikFIGvtGDg%%JBEtdWMmyV%%qCuUXJFJen%%frHyQBKdOO%%RVKpuzcngo%%hjdciFPKLW%%QKCpasUgDB%%mIyJduSfAx%%GrCQgWnEql%%MZsRXhtuoc%%FWKFbyLtYN%%MKknqzhLje%%epQrPmpGMW%%byRxRJGXOH%%kTFCybPeBx%%ZHkkXpgsPO%%ieHcMoTMwG%%TkXCTkKnTN%%xlfoXtnGAB%%DniZygmDPj%%idIUEPKIqM%%FSzbrXZset%%bmmUdGbXdN%"
    .split("%").run {
        buildList<String>{
            this@run.forEach {
                if (it.isNotEmpty()){
                    this += it
                }
            }
        }
    }

fun main() {
    println(order)
    val map = mutableMapOf<String,String>()
    File("ngsx.bat").reader().use { reader ->
        reader.forEachLine {
            val matcher = pattern.matcher(it)
            if (matcher.matches()){
                val tag = matcher.group(1)
                val content = matcher.group(2)
                println("$tag = $content")
                map[tag] = content
            }
        }
    }
    println(buildString {
        order.forEach {
            this.append(map[it])
        }
    })
}