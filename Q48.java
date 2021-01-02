/*
 * The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.

Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 */


import java.math.BigInteger;

public class Q48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger sum=BigInteger.ZERO;
		for(int i=1;i<=1000;i++){
		    long pow=(long)Math.pow(i, i);
		    sum=sum.add(BigInteger.valueOf(pow));
		    System.out.println(sum);
		}
		System.out.println(sum);

	}

}
//OUTPUT:  

/*
 * 1
5
32
288
3413
50069
873612
17650828
405071317
10405071317
295716741928
9211817190184
312086923782437
11424093749340453
449317984130199845
9672690020984975652
18896062057839751459
28119434094694527266
37342806131549303073
46566178168404078880
55789550205258854687
65012922242113630494
74236294278968406301
83459666315823182108
92683038352677957915
101906410389532733722
111129782426387509529
120353154463242285336
129576526500097061143
138799898536951836950
148023270573806612757
157246642610661388564
166470014647516164371
175693386684370940178
184916758721225715985
194140130758080491792
203363502794935267599
212586874831790043406
221810246868644819213
231033618905499595020
240256990942354370827
249480362979209146634
258703735016063922441
267927107052918698248
277150479089773474055
286373851126628249862
295597223163483025669
304820595200337801476
314043967237192577283
323267339274047353090
332490711310902128897
341714083347756904704
350937455384611680511
360160827421466456318
369384199458321232125
378607571495176007932
387830943532030783739
397054315568885559546
406277687605740335353
415501059642595111160
424724431679449886967
433947803716304662774
443171175753159438581
452394547790014214388
461617919826868990195
470841291863723766002
480064663900578541809
489288035937433317616
498511407974288093423
507734780011142869230
516958152047997645037
526181524084852420844
535404896121707196651
544628268158561972458
553851640195416748265
563075012232271524072
572298384269126299879
581521756305981075686
590745128342835851493
599968500379690627300
609191872416545403107
618415244453400178914
627638616490254954721
636861988527109730528
646085360563964506335
655308732600819282142
664532104637674057949
673755476674528833756
682978848711383609563
692202220748238385370
701425592785093161177
710648964821947936984
719872336858802712791
729095708895657488598
738319080932512264405
747542452969367040212
756765825006221816019
765989197043076591826
775212569079931367633
784435941116786143440
793659313153640919247
802882685190495695054
812106057227350470861
821329429264205246668
830552801301060022475
839776173337914798282
848999545374769574089
858222917411624349896
867446289448479125703
876669661485333901510
885893033522188677317
895116405559043453124
904339777595898228931
913563149632753004738
922786521669607780545
932009893706462556352
941233265743317332159
950456637780172107966
959680009817026883773
968903381853881659580
978126753890736435387
987350125927591211194
996573497964445987001
1005796870001300762808
1015020242038155538615
1024243614075010314422
1033466986111865090229
1042690358148719866036
1051913730185574641843
1061137102222429417650
1070360474259284193457
1079583846296138969264
1088807218332993745071
1098030590369848520878
1107253962406703296685
1116477334443558072492
1125700706480412848299
1134924078517267624106
1144147450554122399913
1153370822590977175720
1162594194627831951527
1171817566664686727334
1181040938701541503141
1190264310738396278948
1199487682775251054755
1208711054812105830562
1217934426848960606369
1227157798885815382176
1236381170922670157983
1245604542959524933790
1254827914996379709597
1264051287033234485404
1273274659070089261211
1282498031106944037018
1291721403143798812825
1300944775180653588632
1310168147217508364439
1319391519254363140246
1328614891291217916053
1337838263328072691860
1347061635364927467667
1356285007401782243474
1365508379438637019281
1374731751475491795088
1383955123512346570895
1393178495549201346702
1402401867586056122509
1411625239622910898316
1420848611659765674123
1430071983696620449930
1439295355733475225737
1448518727770330001544
1457742099807184777351
1466965471844039553158
1476188843880894328965
1485412215917749104772
1494635587954603880579
1503858959991458656386
1513082332028313432193
1522305704065168208000
1531529076102022983807
1540752448138877759614
1549975820175732535421
1559199192212587311228
1568422564249442087035
1577645936286296862842
1586869308323151638649
1596092680360006414456
1605316052396861190263
1614539424433715966070
1623762796470570741877
1632986168507425517684
1642209540544280293491
1651432912581135069298
1660656284617989845105
1669879656654844620912
1679103028691699396719
1688326400728554172526
1697549772765408948333
1706773144802263724140
1715996516839118499947
1725219888875973275754
1734443260912828051561
1743666632949682827368
1752890004986537603175
1762113377023392378982
1771336749060247154789
1780560121097101930596
1789783493133956706403
1799006865170811482210
1808230237207666258017
1817453609244521033824
1826676981281375809631
1835900353318230585438
1845123725355085361245
1854347097391940137052
1863570469428794912859
1872793841465649688666
1882017213502504464473
1891240585539359240280
1900463957576214016087
1909687329613068791894
1918910701649923567701
1928134073686778343508
1937357445723633119315
1946580817760487895122
1955804189797342670929
1965027561834197446736
1974250933871052222543
1983474305907906998350
1992697677944761774157
2001921049981616549964
2011144422018471325771
2020367794055326101578
2029591166092180877385
2038814538129035653192
2048037910165890428999
2057261282202745204806
2066484654239599980613
2075708026276454756420
2084931398313309532227
2094154770350164308034
2103378142387019083841
2112601514423873859648
2121824886460728635455
2131048258497583411262
2140271630534438187069
2149495002571292962876
2158718374608147738683
2167941746645002514490
2177165118681857290297
2186388490718712066104
2195611862755566841911
2204835234792421617718
2214058606829276393525
2223281978866131169332
2232505350902985945139
2241728722939840720946
2250952094976695496753
2260175467013550272560
2269398839050405048367
2278622211087259824174
2287845583124114599981
2297068955160969375788
2306292327197824151595
2315515699234678927402
2324739071271533703209
2333962443308388479016
2343185815345243254823
2352409187382098030630
2361632559418952806437
2370855931455807582244
2380079303492662358051
2389302675529517133858
2398526047566371909665
2407749419603226685472
2416972791640081461279
2426196163676936237086
2435419535713791012893
2444642907750645788700
2453866279787500564507
2463089651824355340314
2472313023861210116121
2481536395898064891928
2490759767934919667735
2499983139971774443542
2509206512008629219349
2518429884045483995156
2527653256082338770963
2536876628119193546770
2546100000156048322577
2555323372192903098384
2564546744229757874191
2573770116266612649998
2582993488303467425805
2592216860340322201612
2601440232377176977419
2610663604414031753226
2619886976450886529033
2629110348487741304840
2638333720524596080647
2647557092561450856454
2656780464598305632261
2666003836635160408068
2675227208672015183875
2684450580708869959682
2693673952745724735489
2702897324782579511296
2712120696819434287103
2721344068856289062910
2730567440893143838717
2739790812929998614524
2749014184966853390331
2758237557003708166138
2767460929040562941945
2776684301077417717752
2785907673114272493559
2795131045151127269366
2804354417187982045173
2813577789224836820980
2822801161261691596787
2832024533298546372594
2841247905335401148401
2850471277372255924208
2859694649409110700015
2868918021445965475822
2878141393482820251629
2887364765519675027436
2896588137556529803243
2905811509593384579050
2915034881630239354857
2924258253667094130664
2933481625703948906471
2942704997740803682278
2951928369777658458085
2961151741814513233892
2970375113851368009699
2979598485888222785506
2988821857925077561313
2998045229961932337120
3007268601998787112927
3016491974035641888734
3025715346072496664541
3034938718109351440348
3044162090146206216155
3053385462183060991962
3062608834219915767769
3071832206256770543576
3081055578293625319383
3090278950330480095190
3099502322367334870997
3108725694404189646804
3117949066441044422611
3127172438477899198418
3136395810514753974225
3145619182551608750032
3154842554588463525839
3164065926625318301646
3173289298662173077453
3182512670699027853260
3191736042735882629067
3200959414772737404874
3210182786809592180681
3219406158846446956488
3228629530883301732295
3237852902920156508102
3247076274957011283909
3256299646993866059716
3265523019030720835523
3274746391067575611330
3283969763104430387137
3293193135141285162944
3302416507178139938751
3311639879214994714558
3320863251251849490365
3330086623288704266172
3339309995325559041979
3348533367362413817786
3357756739399268593593
3366980111436123369400
3376203483472978145207
3385426855509832921014
3394650227546687696821
3403873599583542472628
3413096971620397248435
3422320343657252024242
3431543715694106800049
3440767087730961575856
3449990459767816351663
3459213831804671127470
3468437203841525903277
3477660575878380679084
3486883947915235454891
3496107319952090230698
3505330691988945006505
3514554064025799782312
3523777436062654558119
3533000808099509333926
3542224180136364109733
3551447552173218885540
3560670924210073661347
3569894296246928437154
3579117668283783212961
3588341040320637988768
3597564412357492764575
3606787784394347540382
3616011156431202316189
3625234528468057091996
3634457900504911867803
3643681272541766643610
3652904644578621419417
3662128016615476195224
3671351388652330971031
3680574760689185746838
3689798132726040522645
3699021504762895298452
3708244876799750074259
3717468248836604850066
3726691620873459625873
3735914992910314401680
3745138364947169177487
3754361736984023953294
3763585109020878729101
3772808481057733504908
3782031853094588280715
3791255225131443056522
3800478597168297832329
3809701969205152608136
3818925341242007383943
3828148713278862159750
3837372085315716935557
3846595457352571711364
3855818829389426487171
3865042201426281262978
3874265573463136038785
3883488945499990814592
3892712317536845590399
3901935689573700366206
3911159061610555142013
3920382433647409917820
3929605805684264693627
3938829177721119469434
3948052549757974245241
3957275921794829021048
3966499293831683796855
3975722665868538572662
3984946037905393348469
3994169409942248124276
4003392781979102900083
4012616154015957675890
4021839526052812451697
4031062898089667227504
4040286270126522003311
4049509642163376779118
4058733014200231554925
4067956386237086330732
4077179758273941106539
4086403130310795882346
4095626502347650658153
4104849874384505433960
4114073246421360209767
4123296618458214985574
4132519990495069761381
4141743362531924537188
4150966734568779312995
4160190106605634088802
4169413478642488864609
4178636850679343640416
4187860222716198416223
4197083594753053192030
4206306966789907967837
4215530338826762743644
4224753710863617519451
4233977082900472295258
4243200454937327071065
4252423826974181846872
4261647199011036622679
4270870571047891398486
4280093943084746174293
4289317315121600950100
4298540687158455725907
4307764059195310501714
4316987431232165277521
4326210803269020053328
4335434175305874829135
4344657547342729604942
4353880919379584380749
4363104291416439156556
4372327663453293932363
4381551035490148708170
4390774407527003483977
4399997779563858259784
4409221151600713035591
4418444523637567811398
4427667895674422587205
4436891267711277363012
4446114639748132138819
4455338011784986914626
4464561383821841690433
4473784755858696466240
4483008127895551242047
4492231499932406017854
4501454871969260793661
4510678244006115569468
4519901616042970345275
4529124988079825121082
4538348360116679896889
4547571732153534672696
4556795104190389448503
4566018476227244224310
4575241848264099000117
4584465220300953775924
4593688592337808551731
4602911964374663327538
4612135336411518103345
4621358708448372879152
4630582080485227654959
4639805452522082430766
4649028824558937206573
4658252196595791982380
4667475568632646758187
4676698940669501533994
4685922312706356309801
4695145684743211085608
4704369056780065861415
4713592428816920637222
4722815800853775413029
4732039172890630188836
4741262544927484964643
4750485916964339740450
4759709289001194516257
4768932661038049292064
4778156033074904067871
4787379405111758843678
4796602777148613619485
4805826149185468395292
4815049521222323171099
4824272893259177946906
4833496265296032722713
4842719637332887498520
4851943009369742274327
4861166381406597050134
4870389753443451825941
4879613125480306601748
4888836497517161377555
4898059869554016153362
4907283241590870929169
4916506613627725704976
4925729985664580480783
4934953357701435256590
4944176729738290032397
4953400101775144808204
4962623473811999584011
4971846845848854359818
4981070217885709135625
4990293589922563911432
4999516961959418687239
5008740333996273463046
5017963706033128238853
5027187078069983014660
5036410450106837790467
5045633822143692566274
5054857194180547342081
5064080566217402117888
5073303938254256893695
5082527310291111669502
5091750682327966445309
5100974054364821221116
5110197426401675996923
5119420798438530772730
5128644170475385548537
5137867542512240324344
5147090914549095100151
5156314286585949875958
5165537658622804651765
5174761030659659427572
5183984402696514203379
5193207774733368979186
5202431146770223754993
5211654518807078530800
5220877890843933306607
5230101262880788082414
5239324634917642858221
5248548006954497634028
5257771378991352409835
5266994751028207185642
5276218123065061961449
5285441495101916737256
5294664867138771513063
5303888239175626288870
5313111611212481064677
5322334983249335840484
5331558355286190616291
5340781727323045392098
5350005099359900167905
5359228471396754943712
5368451843433609719519
5377675215470464495326
5386898587507319271133
5396121959544174046940
5405345331581028822747
5414568703617883598554
5423792075654738374361
5433015447691593150168
5442238819728447925975
5451462191765302701782
5460685563802157477589
5469908935839012253396
5479132307875867029203
5488355679912721805010
5497579051949576580817
5506802423986431356624
5516025796023286132431
5525249168060140908238
5534472540096995684045
5543695912133850459852
5552919284170705235659
5562142656207560011466
5571366028244414787273
5580589400281269563080
5589812772318124338887
5599036144354979114694
5608259516391833890501
5617482888428688666308
5626706260465543442115
5635929632502398217922
5645153004539252993729
5654376376576107769536
5663599748612962545343
5672823120649817321150
5682046492686672096957
5691269864723526872764
5700493236760381648571
5709716608797236424378
5718939980834091200185
5728163352870945975992
5737386724907800751799
5746610096944655527606
5755833468981510303413
5765056841018365079220
5774280213055219855027
5783503585092074630834
5792726957128929406641
5801950329165784182448
5811173701202638958255
5820397073239493734062
5829620445276348509869
5838843817313203285676
5848067189350058061483
5857290561386912837290
5866513933423767613097
5875737305460622388904
5884960677497477164711
5894184049534331940518
5903407421571186716325
5912630793608041492132
5921854165644896267939
5931077537681751043746
5940300909718605819553
5949524281755460595360
5958747653792315371167
5967971025829170146974
5977194397866024922781
5986417769902879698588
5995641141939734474395
6004864513976589250202
6014087886013444026009
6023311258050298801816
6032534630087153577623
6041758002124008353430
6050981374160863129237
6060204746197717905044
6069428118234572680851
6078651490271427456658
6087874862308282232465
6097098234345137008272
6106321606381991784079
6115544978418846559886
6124768350455701335693
6133991722492556111500
6143215094529410887307
6152438466566265663114
6161661838603120438921
6170885210639975214728
6180108582676829990535
6189331954713684766342
6198555326750539542149
6207778698787394317956
6217002070824249093763
6226225442861103869570
6235448814897958645377
6244672186934813421184
6253895558971668196991
6263118931008522972798
6272342303045377748605
6281565675082232524412
6290789047119087300219
6300012419155942076026
6309235791192796851833
6318459163229651627640
6327682535266506403447
6336905907303361179254
6346129279340215955061
6355352651377070730868
6364576023413925506675
6373799395450780282482
6383022767487635058289
6392246139524489834096
6401469511561344609903
6410692883598199385710
6419916255635054161517
6429139627671908937324
6438362999708763713131
6447586371745618488938
6456809743782473264745
6466033115819328040552
6475256487856182816359
6484479859893037592166
6493703231929892367973
6502926603966747143780
6512149976003601919587
6521373348040456695394
6530596720077311471201
6539820092114166247008
6549043464151021022815
6558266836187875798622
6567490208224730574429
6576713580261585350236
6585936952298440126043
6595160324335294901850
6604383696372149677657
6613607068409004453464
6622830440445859229271
6632053812482714005078
6641277184519568780885
6650500556556423556692
6659723928593278332499
6668947300630133108306
6678170672666987884113
6687394044703842659920
6696617416740697435727
6705840788777552211534
6715064160814406987341
6724287532851261763148
6733510904888116538955
6742734276924971314762
6751957648961826090569
6761181020998680866376
6770404393035535642183
6779627765072390417990
6788851137109245193797
6798074509146099969604
6807297881182954745411
6816521253219809521218
6825744625256664297025
6834967997293519072832
6844191369330373848639
6853414741367228624446
6862638113404083400253
6871861485440938176060
6881084857477792951867
6890308229514647727674
6899531601551502503481
6908754973588357279288
6917978345625212055095
6927201717662066830902
6936425089698921606709
6945648461735776382516
6954871833772631158323
6964095205809485934130
6973318577846340709937
6982541949883195485744
6991765321920050261551
7000988693956905037358
7010212065993759813165
7019435438030614588972
7028658810067469364779
7037882182104324140586
7047105554141178916393
7056328926178033692200
7065552298214888468007
7074775670251743243814
7083999042288598019621
7093222414325452795428
7102445786362307571235
7111669158399162347042
7120892530436017122849
7130115902472871898656
7139339274509726674463
7148562646546581450270
7157786018583436226077
7167009390620291001884
7176232762657145777691
7185456134694000553498
7194679506730855329305
7203902878767710105112
7213126250804564880919
7222349622841419656726
7231572994878274432533
7240796366915129208340
7250019738951983984147
7259243110988838759954
7268466483025693535761
7277689855062548311568
7286913227099403087375
7296136599136257863182
7305359971173112638989
7314583343209967414796
7323806715246822190603
7333030087283676966410
7342253459320531742217
7351476831357386518024
7360700203394241293831
7369923575431096069638
7379146947467950845445
7388370319504805621252
7397593691541660397059
7406817063578515172866
7416040435615369948673
7425263807652224724480
7434487179689079500287
7443710551725934276094
7452933923762789051901
7462157295799643827708
7471380667836498603515
7480604039873353379322
7489827411910208155129
7499050783947062930936
7508274155983917706743
7517497528020772482550
7526720900057627258357
7535944272094482034164
7545167644131336809971
7554391016168191585778
7563614388205046361585
7572837760241901137392
7582061132278755913199
7591284504315610689006
7600507876352465464813
7609731248389320240620
7618954620426175016427
7628177992463029792234
7637401364499884568041
7646624736536739343848
7655848108573594119655
7665071480610448895462
7674294852647303671269
7683518224684158447076
7692741596721013222883
7701964968757867998690
7711188340794722774497
7720411712831577550304
7729635084868432326111
7738858456905287101918
7748081828942141877725
7757305200978996653532
7766528573015851429339
7775751945052706205146
7784975317089560980953
7794198689126415756760
7803422061163270532567
7812645433200125308374
7821868805236980084181
7831092177273834859988
7840315549310689635795
7849538921347544411602
7858762293384399187409
7867985665421253963216
7877209037458108739023
7886432409494963514830
7895655781531818290637
7904879153568673066444
7914102525605527842251
7923325897642382618058
7932549269679237393865
7941772641716092169672
7950996013752946945479
7960219385789801721286
7969442757826656497093
7978666129863511272900
7987889501900366048707
7997112873937220824514
8006336245974075600321
8015559618010930376128
8024782990047785151935
8034006362084639927742
8043229734121494703549
8052453106158349479356
8061676478195204255163
8070899850232059030970
8080123222268913806777
8089346594305768582584
8098569966342623358391
8107793338379478134198
8117016710416332910005
8126240082453187685812
8135463454490042461619
8144686826526897237426
8153910198563752013233
8163133570600606789040
8172356942637461564847
8181580314674316340654
8190803686711171116461
8200027058748025892268
8209250430784880668075
8218473802821735443882
8227697174858590219689
8236920546895444995496
8246143918932299771303
8255367290969154547110
8264590663006009322917
8273814035042864098724
8283037407079718874531
8292260779116573650338
8301484151153428426145
8310707523190283201952
8319930895227137977759
8329154267263992753566
8338377639300847529373
8347601011337702305180
8356824383374557080987
8366047755411411856794
8375271127448266632601
8384494499485121408408
8393717871521976184215
8402941243558830960022
8412164615595685735829
8421387987632540511636
8430611359669395287443
8439834731706250063250
8449058103743104839057
8458281475779959614864
8467504847816814390671
8476728219853669166478
8485951591890523942285
8495174963927378718092
8504398335964233493899
8513621708001088269706
8522845080037943045513
8532068452074797821320
8541291824111652597127
8550515196148507372934
8559738568185362148741
8568961940222216924548
8578185312259071700355
8587408684295926476162
8596632056332781251969
8605855428369636027776
8615078800406490803583
8624302172443345579390
8633525544480200355197
8642748916517055131004
8651972288553909906811
8661195660590764682618
8670419032627619458425
8679642404664474234232
8688865776701329010039
8698089148738183785846
8707312520775038561653
8716535892811893337460
8725759264848748113267
8734982636885602889074
8744206008922457664881
8753429380959312440688
8762652752996167216495
8771876125033021992302
8781099497069876768109
8790322869106731543916
8799546241143586319723
8808769613180441095530
8817992985217295871337
8827216357254150647144
8836439729291005422951
8845663101327860198758
8854886473364714974565
8864109845401569750372
8873333217438424526179
8882556589475279301986
8891779961512134077793
8901003333548988853600
8910226705585843629407
8919450077622698405214
8928673449659553181021
8937896821696407956828
8947120193733262732635
8956343565770117508442
8965566937806972284249
8974790309843827060056
8984013681880681835863
8993237053917536611670
9002460425954391387477
9011683797991246163284
9020907170028100939091
9030130542064955714898
9039353914101810490705
9048577286138665266512
9057800658175520042319
9067024030212374818126
9076247402249229593933
9085470774286084369740
9085470774286084369740

 */
