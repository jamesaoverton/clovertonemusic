(ns clovertonemusic.composers-page)

(load "chart-divs")

(require '[clovertonemusic.chart-divs :as chart-divs])

(def html-composers
  {"allison-au" {:title "Allison Au - Clovertone Music"
                :contents [:div#contents
                           [:div#content
                            [:h1.title "Allison Au"]
                            [:img.float {:src "/images/allison-au.jpg"}]
                            [:p
                             "Saxophonist/flautist Allison Au is a graduate of the Humber College Music program in Toronto. She has studied with Pat LaBarbera, Hilario Duran, John McLeod, Andy Ballantyne, Kelly Jefferson and Luis Mario Ochoa."]
                            [:p
                             "She is the recipient of the Duke Ellington Scholarship for Outstanding Achievement and the Ron Collier Memorial Scholarship for Outstanding Achievement in Arranging. Her current work as an arranger spans many genres including jazz, Latin jazz, Salsa, Cumbia, Merengue, and contemporary improvisational music. She has dealt with instrumentation formats ranging from big band ensembles, small jazz combos and string ensembles."]
                            [:p
                             "A member of SOCAN, Allison currently lives in Toronto where she divides her time as a freelance performer and composer/arranger."]
                            [:div.clear]]]
                :charts [:div#charts
                         [:div#list
                          [:div#13.chart.grade3 chart-divs/four-more-to-go]]]
                :users [:div#users]}
   "andy-ballantyne" {:title "Andy Ballantyne - Clovertone Music"
                      :contents [:div#contents
                                 [:div#content
                                  [:h1.title "Andy Ballantyne"]
                                  [:img.float {:src "/images/andy-ballantyne.jpg"}]
                                  [:p
                                   "A native of Toronto, Andy Ballantyne began learning music in the Toronto public school system, studying clarinet and saxophone. He soon developed an interest in jazz and studied privately with Woody Herman alumnus Steve Lederer. Later teachers included Pat Labarbara, Alex Dean and Mike Murley. Exposure to recordings of the Stan Kenton Band, Nimmons and Nine Plus Six, and especially Rob McConnell’s Boss Brass fueled an early interest in composition and arranging. Andy went on to study arranging, orchestration and composition with Ron Collier at Humber College and Phil Nimmons at the University of Toronto."]
                                  [:p
                                   "Andy gained his first professional experience at Expo’86 in Vancouver playing daily for five months with the Humber College big band under the direction of Ron Collier, and went on to play in the Ron Collier Jazz Orchestra up until the time of Ron’s death in 2003."]
                                  [:p
                                   "Over the past 20 years, Andy has established himself on the Toronto scene as a versatile performer on saxophone and woodwinds, as well as an arranger and jazz educator. He is a regular member of several noted jazz groups, including NOJO, John Macleod’s Rex Hotel Orchestra, the Art of Jazz Big Band, Nimmons and Nine Now, and the Paul Read Orchestra. Andy has also performed with groups led by Don Thompson, Dave Young, Mark McLean, Mike McClennan and Laila Biali. He currently leads two of his own groups: the 11-piece Andy Ballantyne Large Ensemble (ABLE) and The Sidewinders, a quintet dedicated to exploring and rediscovering the acoustic soul jazz of the 1960’s. Future plans include a trio project dedicated to the music of Jimmy Giuffre."]
                                  [:p
                                   "Career highlight include appearances with some of the world’s foremost jazz musicians and composers including Dave Holland, Sam Rivers, Don Byron, Kevin Mahogany, Vince Mendoza, Kenny Wheeler and Carla Bley. Andy has recorded performances for broadcast on CBC’s “Jazz Beat”, and for Jazz FM’s “Sound of Toronto Jazz” series, and he also toured western Canada with NOJO9 in 2005. In 2008 he had the honor of performing with Rob McConnell and the Boss Brass at their highly anticipated reunion concert at the Old Mill in Toronto."]
                                  [:p
                                   "Andy’s arrangements and compositions have been featured on several recordings, and have also been performed by the University of Toronto Ten O’Clock Jazz Orchestra at the International Association of Jazz Educators Conference in Atlanta (1996) and Toronto (2003). He has also contributed original compositions to Nimmons and Nine Now, a group formed by guitarist Mike Cado and overseen by Phil Nimmons to perform Phil’s music from the 1950’s, and to explore new directions for this unconventional instrumentation."]
                                  [:p
                                   "Over the past few years composition has become an increasingly large part of Andy’s creative output, culminating in the debut of the Andy Ballantyne Large Ensemble at the Rex Jazz Bar in Toronto in March of 2006. This 11-piece band performs original compositions and arrangements by Andy and includes some of Canada’s finest jazz musicians; most notably David Braid, Kevin Turcotte, William Carn and Kelly Jefferson. Their debut CD “the Sum of the Parts” was released in 2008 to critical acclaim in Canada, the United States and Europe, and is available through cdbaby.com and also on Itunes and Amazon.com."]
                                  [:p
                                   "Andy has been on the faculty at Humber College since 2002 teaching theory, composition and arranging, as well as coaching ensembles and giving private instruction on saxophone."]
                                  [:div.clear]]]
                      :charts [:div#charts
                               [:div#list
                                [:div#11.chart.grade1 chart-divs/game-on]
                                [:div#25.chart.grade4 chart-divs/the-phone-dont-ring-jack]
                                [:div#36.chart.grade1 chart-divs/shuswap-shuffle]
                                [:div#37.chart.grade1 chart-divs/red-river-mud-pie]
                                [:div#41.chart.grade4 chart-divs/vista]
                                [:div#56.chart.grade3 chart-divs/dark-matter]
                                [:div#57.chart.grade4 chart-divs/the-fifth-beatle]
                                [:div#70.chart.grade3 chart-divs/el-castor-loco]
                                [:div#81.chart.grade4 chart-divs/epitaph]]]
                      :users [:div#users]}
   "brad-cheeseman" {:title "Brad Cheeseman - Clovertone Music"
                     :contents [:div#contents
                                [:div#content
                                 [:h1.title "Brad Cheeseman"]
                                 [:img.float {:src "/images/brad-cheeseman.jpg"}]
                                 [:p
                                  "Brad Cheeseman is a bassist, composer, arranger and educator that has been performing in the Greater Toronto and Hamilton Area for over a decade. He leads the award-winning Brad Cheeseman Group, which features his original contemporary jazz compositions, was a finalist in the Toronto Jazz Orchestra’s 2014 Call for Scores, and has shared the stage with many great Canadian jazz musicians, including Bruce Cassidy, Terry Clarke, Adrean Farrugia, John Macleod, Mike Malone, Reg Schwager and Nancy Walker. Brad holds a Masters degree in music composition from York University, and is an Honours graduate of both Mohawk College and Humber College’s music programs."]
                                 [:div.clear]]]
                     :charts [:div#charts
                              [:div#list
                               [:div#91.chart.grade4 chart-divs/song-for-l]]]
                     :users [:div#users]}
   "brad-harrison" {:title "Brad Harrison - Clovertone Music"
                    :contents [:div#contents
                               [:div#content
                                [:h1.title "Brad Harrison"]
                                [:img.float {:src "/images/brad-harrison.jpg"}]
                                [:p
                                 "After spending several years on violin and piano, Brad discovered the trumpet in high school and hasn't looked back. Since then, he has gone on to study classical trumpet and composition at University of Toronto as well as jazz performance and arranging at Humber College. His teachers have included Jim Spragg, Brian O’Kane, John MacLeod, Brigham Philips, Steven Crowe, and Steve McDade."]
                                [:p
                                 "As a composer, Brad has written for many different types of ensembles in a variety of genres including choir, solo voice and piano, and various sized brass and jazz ensembles. His 8-piece brass band, BrassAckwards, plays only original arrangements from a wide variety of genres."]
                                [:p
                                 "Brad is a versatile performer, equally at home in a jazz combo, chamber ensemble, big band, or pit orchestra. Interestingly enough, Brad may be the only person to have played hockey and the national anthem at both Maple Leaf Gardens and the Air Canada Center. His varied career has allowed him the privilege of sharing the stage with such acclaimed artists as The Canadian Brass, Alistair Kay, Alain Trudel, Hilario Duran, Dave Douglas, and Randy Brecker."]
                                [:p
                                 "Brad currently runs the Private Lesson Program at St. Michael’s College School where he also keeps his own studio of trumpet students."]
                                [:div.clear]]]
                    :charts [:div#charts
                             [:div#list
                              [:div#88.chart.grade2 chart-divs/brown-and-tan]
                              [:div#108.chart.grade2 chart-divs/the-long-way-home]]]
                    :users [:div#users]}
   "chelsea-mcbride" {:title "Chelsea McBride - Clovertone Music"
                      :contents [:div#contents
                                 [:div#content
                                  [:h1.title "Chelsea McBride"]
                                  [:img.float {:src "/images/chelsea-mcbride.jpg"}]
                                  [:p
                                   "Driven by an endless need for expressing herself creatively, young composer and multi-instrumentalist Chelsea McBride has burst onto the Toronto jazz scene. Still only 24, McBride has performed at the TD Toronto Jazz Festival, Beaches Jazz Festival and the Rex Hotel. She’s also worked alongside many local jazz artists including Brownman Ali and William Carn and studied with acclaimed musicians David Occhipinti, Darcy James Argue and Mike Allen.\nBorn and raised in Vancouver B.C., Chelsea was surrounded and fascinated by music. She started playing piano at the age of 3, and saxophone throughout elementary school. By the end of high school she had already performed in competitions at provincial and national levels. In 2014, she graduated from the Humber Bachelor of Music program in Toronto, ON and was the first recipient of the Toronto Arts Foundation’s Emerging Jazz Artist award. Whether it’s her big band (Chelsea McBride’s Socialist Night School), her pop-fusion band (Chelsea and the Cityscape), her jazz trio (Chelsea McBride Group), or her video game cover band (Koopa Troop), Chelsea is a diverse musician who refuses to stay in one creative box. Aside from her own projects, she also regularly performs with other local acts including the Brad Cheeseman Group, Skirt Check, Soul Finger and Elton Joan. Chelsea can be heard around Toronto playing several shows per month. She has released two EPs with Chelsea and the Cityscape and one EP with Socialist Night School. "]
                                  [:div.clear]]]
                      :charts [:div#charts
                               [:div#list
                                [:div#96.chart.grade4 chart-divs/state-of-mind]
                                [:div#97.chart.grade4 chart-divs/state-of-mind-reprise]
                                [:div#98.chart.grade4 chart-divs/river]
                                [:div#99.chart.grade4 chart-divs/julia]
                                [:div#100.chart.grade4 chart-divs/thinking-in-circles]
                                [:div#105.chart.grade3 chart-divs/last-resorts]
                                [:div#109.chart.grade4 chart-divs/ambleside]
                                [:div#110.chart.grade4 chart-divs/intransitory]
                                [:div#111.chart.grade4 chart-divs/twilight-fall]
                                [:div#112.chart.grade4 chart-divs/smooth]
                                [:div#113.chart.grade4 chart-divs/spirits]
                                [:div#114.chart.grade4 chart-divs/arrival-of-the-pegasus]
                                [:div#115.chart.grade4 chart-divs/foot-in-mouth]
                                [:div#116.chart.grade4 chart-divs/in-dreams]
                                [:div#117.chart.grade4 chart-divs/ambleside-reprise]
                                [:div#118.chart.grade4 chart-divs/something-simple]]]
                      :users [:div#users]}
   "chris-hunt" {:title "Chris Hunt - Clovertone Music"
                 :contents [:div#contents
                            [:div#content
                             [:h1.title "Chris Hunt"]
                             [:img.float {:src "/images/chris-hunt.jpg"}]
                             [:p
                              "Composer, arranger, trombonist Chris Hunt is a graduate of the University of Toronto’s Jazz Performance program. Chris works as a freelance musician in his native Toronto, in a variety of settings. Years of experience with brass quintets and musicals, big bands and smaller jazz ensembles have solidified Chris’ reputation as a truly versatile performer and composer."]
                             [:p
                              "As well as teaching private students, Chris is also on faculty at Seneca College. In 2003, Chris attended the Banff International Jazz Workshop."]
                             [:p
                              "In May of 2004, he released The Chris Hunt Tentet’s first full-length album, First X’s Free. His quintet, Big Lots, released a limited edition EP in 2005. In spring of 2006 The Tentet recorded the Dirrty Dog live at the Rex Hotel."]
                             [:div.clear]]]
                 :charts [:div#charts
                          [:div#list
                           [:div#8.chart.grade3 chart-divs/the-dirrty-dog]
                           [:div#26.chart.grade4 chart-divs/first-x-free]
                           [:div#72.chart.grade2 chart-divs/sometimes-i-feel]]]
                 :users [:div#users]}
   "christian-overton" {:title "Christian Overton - Clovertone Music"
                        :contents [:div#contents
                                   [:div#content
                                    [:h1.title "Christian Overton"]
                                    [:img.float {:src "/images/christian-overton.jpg"}]
                                    [:p
                                     "If you ask jazz trombonist Christian Overton when his musical destiny unfolded, you’ll get a refreshingly simple story. Don’t wait for swooning tales about obscure jazz records with intricate trombone solos and performances that set him on the unchangeable path to becoming a musician. All that inspiration actually followed after an older brother introduced the trombone to a young Christian one day in the family room. “I thought I would be ahead of my grade six music class,” Christian confesses with charismatic honesty. From precocious schoolboy to Humber music performance graduate, Christian Overton is now one of Toronto’s leading jazz musicians and writers—who also admits “…all the saxophones were taken by the time the teacher got to the letter ‘O’.” Growing up in Sudbury, Ontario, Christian’s childhood was comic books, snow, and music appreciation for fun. His father (one of Northern Ontario’s foremost radio personalities) played all sorts of tunes for the four Overton kids to enjoy. Sessions of classical Beethoven changed to the smooth seventies rock of Chicago and then backtracked to The Beatles. The defining moment, however, of Christian’s fascination with jazz happened with a gift from his uncle—Mellow-Dy by Slide Hampton. “Slide played things on the trombone I never heard before or even dreamed were possible.” After that first trombone lesson in a house filled with music, a life all about jazz was taking shape. Christian’s formal music education became an important experience. He was fortunate to attend schools with highly regarded music programs where his abilities were encouraged and challenged. As a teenager, Christian continued to explore the giants of trombone history, listening endlessly to the sweet melodies of JJ Johnson and carefully noting Curtis Fuller’s technical mastery. “I used to listen to the records and learn the solos too,” says Christian. “I could eventually play along with them note for note.” Surrounded by these influences and dedicated teachers, Christian soon showed great promise as a trombonist, improviser, and bandleader. In fact, when he was nearly finished high school, he was already leading a working jazz trio and had professional experience in every genre from dance bands to symphony orchestras and studio work."]
                                    [:p
                                     "Leaving his Sudbury home, Christian accepted a scholarship for jazz performance at Humber College in Toronto where he excelled both in the classroom and on the college performance circuit. He studied with some of the nation’s top jazz musicians including Pat LaBarbera, John Macleod, and Alistair Kay. Christian expanded his instrumental skills into bass trombone doubling and his musical proficiency as a contemporary jazz arranger/composer for combo and big band. On the stage, his dynamic performance abilities were obvious, playing a variety of styles from jazz to Latin to R&B. Christian was also featured on seven college-produced records as a member of the prestigious Humber Studio Jazz ensemble. Now living in Toronto, Christian’s career is gaining such momentum that it’s hard to keep up! He performs in a variety of ensembles regularly including the nine-piece funk band King Sunshine, The Toronto Jazz Orchestra, and most recently, The Art of Jazz Orchestra in addition to various other pit orchestras and jobbing bands. Christian is also the featured composer and musical director for The Composers Collective Big Band, a seventeen-piece ensemble performing high-energy, contemporary works that smash the traditions of the Toronto jazz scene. Christian can also be heard on television, writing material for various productions such as School of Chef and Sun TV’s, King Kaboom."]
                                    [:div.clear]]]
                        :charts [:div#charts
                                 [:div#list
                                  [:div#2.chart.grade1 chart-divs/o-canada]
                                  [:div#3.chart.grade3 chart-divs/the-pursuit]
                                  [:div#4.chart.grade1 chart-divs/sock-hop-be-bop]
                                  [:div#5.chart.grade1 chart-divs/tango]
                                  [:div#6.chart.grade1 chart-divs/sakura-lullaby]
                                  [:div#7.chart.grade2 chart-divs/detective-story]
                                  [:div#9.chart.grade2 chart-divs/that-look]
                                  [:div#10.chart.grade2 chart-divs/atlantic-crossing]
                                  [:div#14.chart.grade3 chart-divs/yun-gia]
                                  [:div#15.chart.grade2 chart-divs/electros-next-plot-jr]
                                  [:div#16.chart.grade4 chart-divs/two-dave-k]
                                  [:div#17.chart.grade4 chart-divs/a-kingdoms-last-hope]
                                  [:div#18.chart.grade4 chart-divs/ten-41-am]
                                  [:div#19.chart.grade4 chart-divs/wood-and-shadow]
                                  [:div#20.chart.grade4 chart-divs/electros-next-plot]
                                  [:div#27.chart.grade1 chart-divs/at-long-last]
                                  [:div#29.chart.grade1 chart-divs/hotel-mambo]
                                  [:div#30.chart.grade1 chart-divs/petes-chune]
                                  [:div#31.chart.grade2 chart-divs/a-kingdoms-last-hope-jr]
                                  [:div#32.chart.grade1 chart-divs/train-track]
                                  [:div#33.chart.grade3 chart-divs/the-green-blues]
                                  [:div#34.chart.grade3 chart-divs/arcadian-autumn]
                                  [:div#46.chart.grade3 chart-divs/silent-night]
                                  [:div#47.chart.grade3 chart-divs/joy-to-the-world]
                                  [:div#48.chart.grade3 chart-divs/canal-street-walk]
                                  [:div#49.chart.grade2 chart-divs/cloud-song]
                                  [:div#50.chart.grade3 chart-divs/the-dancehall-shake]
                                  [:div#51.chart.grade3 chart-divs/femis-flight]
                                  [:div#52.chart.grade2 chart-divs/let-me-be]
                                  [:div#54.chart.grade2 chart-divs/lifted]
                                  [:div#55.chart.grade3 chart-divs/lost-stories]
                                  [:div#64.chart.grade2 chart-divs/a-long-kept-secret]
                                  [:div#65.chart.grade1 chart-divs/cowboy-countdown]
                                  [:div#66.chart.grade2 chart-divs/crusin-at-30000]
                                  [:div#67.chart.grade2 chart-divs/the-gene-machine]
                                  [:div#68.chart.grade2 chart-divs/go-go-blues]
                                  [:div#69.chart.grade3 chart-divs/the-test]
                                  [:div#73.chart.grade2 chart-divs/friday-night-special]
                                  [:div#74.chart.grade2 chart-divs/god-rest-ye]
                                  [:div#84.chart.grade1 chart-divs/blue-heron]
                                  [:div#85.chart.grade3 chart-divs/hamunaptra]
                                  [:div#86.chart.grade2 chart-divs/the-first-noel]
                                  [:div#87.chart.grade2 chart-divs/what-once-was]
                                  [:div#93.chart.grade2 chart-divs/good-king-w]
                                  [:div#94.chart.grade3 chart-divs/introduccion]
                                  [:div#95.chart.grade2 chart-divs/no-trespassing]
                                  [:div#101.chart.grade3 chart-divs/midnight-clear]
                                  [:div#102.chart.grade3 chart-divs/life-race]]]
                        :users [:div#users]}
   "erik-patterson" {:title "Erik Patterson - Clovertone Music"
                     :contents [:div#contents
                                [:div#content
                                 [:h1.title "Erik Patterson"]
                                 [:img.float {:src "/images/erik-patterson.jpg"}]
                                 [:p
                                  "Versatile writer Erik Patterson has won several awards as a composer, and his works are regularly performed by several bands around the city, including the Composer’s Collective Big Band, an 18 piece jazz orchestra in which he is a founding member, and guitarist. As a performer, Erik has played guitar, mandolin, banjo, and piano for pit bands, solo acts, and accompanist roles, in all styles of western music."]
                                 [:p
                                  "Erik is a graduate of the Humber College music program, with a bachelor of music."]
                                 [:div.clear]]]
                     :charts [:div#charts
                              [:div#list
                               [:div#12.chart.grade3 chart-divs/on-the-ending-earth]
                               [:div#35.chart.grade1 chart-divs/all-your-base]
                               [:div#60.chart.grade1 chart-divs/gentlemen]
                               [:div#61.chart.grade1 chart-divs/la-cattura]
                               [:div#75.chart.grade1 chart-divs/la-squadra-da-milano]
                               [:div#76.chart.grade1 chart-divs/stone-cold-strut]]]
                     :users [:div#users]}
   "ewan-divitt" {:title "Ewan Divitt - Clovertone Music"
                  :contents [:div#contents
                             [:div#content
                              [:h1.title "Ewan Divitt"]
                              [:img.float {:src "/images/ewan-divitt.jpg"}]
                              [:p
                               "Ewan Divitt is a trumpet player, composer, arranger, and brass instrument repair technician.\nHe is a graduate of Etobicoke School of the Arts and Humber College.\nWhile at Humber College, Ewan received the Harknett Musical Services award for excellence in brass, as well as the Duke Ellington Society Award for excellence in composition and arranging.\nWhile at Humber, Ewan had the privilege of performing with Michael and Randy Brecker, Bill Holman, Dave Holland, as well as spending a semester doing weekly composition and ensemble training with Rob McConnell. Ewan studied trumpet with Scott Harrison, Brian O'Kane, and Steve Crowe. He has also studied arranging with Andy Ballantyne, and John MacLeod.\nEwan is an in-demand trumpet player in Toronto, and has recorded on many albums, and demos, music videos, played live on the radio, international live television, as well as toured with musical acts all over Ontario and Quebec.\nEwan also leads his own big band that features many of the finest up and coming players in Toronto. The band plays original compositions and arrangements by Ewan and other members of the band.\nYou can listen to tracks from the bands live performances at www.ewandivitt.com"]
                              [:div.clear]]]
                  :charts [:div#charts
                           [:div#list
                            [:div#83.chart.grade3 chart-divs/don-carlos-dream]]]
                  :users [:div#users]}
   "greg-crowe" {:title "Greg Crowe - Clovertone Music"
                 :contents [:div#contents
                            [:div#content
                             [:h1.title "Greg Crowe"]
                             [:img.float {:src "/images/greg-crowe.jpg"}]
                             [:p
                              "Brass specialist Greg Crowe is a music educator at Glenlawn Collegiate Institute in Winnipeg where he teaches Band, Jazz Band, Choir, Musical Theatre and Technical Music Production. He holds bachelor degrees in Music and Education from the University of Manitoba. In addition to writing for jazz band, Greg has also composed several works for Choir and Vocal Jazz groups which have been performed/premiered by different ensembles in Winnipeg. From 2007-09, Greg partnered with Toronto musician Mitch 'King Kong' Girio and Winnipeg actor/playwright Cory Wojcik to write LondonTown - a dynamic ska musical that spoke to the realities of life in Northern Manitoba. The work premiered in 2009 at the Carol Shields Festival of New Works. Greg has also served as director of the Winnipeg New Horizons Band from 2008-2013 and is an active performer with his band, The Scarlet Union. Greg lives in southern Winnipeg with his wonderful wife Erin and his two beautiful children Benjamin and Olivia."]
                             [:div.clear]]]
                 :charts [:div#charts
                          [:div#list
                           [:div#71.chart.grade2 chart-divs/en-su-camino]
                           [:div#90.chart.grade2 chart-divs/livvy-dear]
                           [:div#104.chart.grade3 chart-divs/la-maquina]]]
                 :users [:div#users]}
   "jason-logue" {:title "Jason Logue - Clovertone Music"
                  :contents [:div#contents
                             [:div#content
                              [:h1.title "Jason Logue"]
                              [:img.float {:src "/images/jason-logue.jpg"}]
                              [:p
                               "Trumpeter Jason Logue has grown to be one of Canada’s finest musicians and composers. He has performed or recorded with such jazz artists as Sam Rivers, The Woody Herman Orchestra, Dave Brubek, Phil Nimmons, Dave Grusin, Louis Belson, Kenny Wheeler, Dee Dee Bridgewater, Guido Basso, Jim McNeeley and Rob McConnell."]
                              [:p
                               "Most Recently Jason Has Recorded with Jazz Singers Emilie-Claire Barlow,\nSophie Milman and Michael Kaeshammer. At Present Jason has been spotted playing with David Clayton-Thomas, Manteca, The Brian Barlow Big Band, The Mike Malone Jazz Orchestra, The Hilario Duran Latin Jazz Big Band, Andy Ballyntynes Large Ensemble, John Macleod and The Rex Hotel Orchestra, N.O.J.O. , Random Access Large Ensemble, The Bob Rice Latin Big Band, The Darcy Hepner Jazz Orchestra, And His Own Band, the Jason Logue Sextet."]
                              [:p
                               "As a freelance trumpeter, Jason has backed up artists such as Diana Krall, John Pizzarelli, Aretha Franklin, Chantal Kreviazuk, Shirley Bassey, The Funk Brothers, Johnny Mathis, Jeff Healey, Mary Wilson, Bernadette Peters, Marie Osmond, Ben Vareen, Hal Linden, Don Rickles, Joan Rivers, Bobby Vinton, Little Anthony and the imperials, The Temptations, The 4 Tops, The Platters, Maureen McGovern, Robbie Lane and the Deciples, The Coasters, Martha Reeves, The Spinners, Frankie Valli, Fabian and Bobby Ridell."]
                              [:p
                               "Jason has also performed in the Toronto productions of the musicals Dirty Dancing, Hairspray, The Last Empress, The Sound of Music, West Side Story, The Rat Pack, Ross Petty’s Cinderella, Jersey Boys, the Shaw Festival, The Stratford Festival, The Addams Family, 9 to 5, Come Fly Away, Young Frankenstien and Hair. As well, Jason has performed with the Toronto Symphony Orchestra and the National Arts Center Orchestra (Ottawa) as a guest 1st trumpet for many pops concerts."]
                              [:p
                               "Jason is currently on the Faculty at Mohawk College in Hamilton, Ontario and The Universtiy of Toronto."]
                              [:div.clear]]]
                  :charts [:div#charts
                           [:div#list
                            [:div#77.chart.grade3 chart-divs/the-phantom]
                            [:div#80.chart.grade4 chart-divs/santiago-nights]
                            [:div#106.chart.grade3 chart-divs/mad-man-mambo]]]
                  :users [:div#users]}
   "jim-lewis" {:title "Jim Lewis - Clovertone Music"
                :contents [:div#contents
                           [:div#content
                            [:h1.title "Jim Lewis"]
                            [:img.float {:src "/images/jim-lewis.jpg"}]
                            [:p
                             "Jim Lewis is a freelance trumpet player, improviser, composer/arranger and educator. He is a member of the Paul Read Orchestra, Frank Lozano Group, Christine Duncan’s Element Choir, Frogmouth, and his own improvising Trio. He can be heard in clubs in the Toronto area, Ottawa, and Montreal as a sideman and with his own projects from duo to sextet. Jim has been featured on CBC’s Jazzbeat, and Radio-Canada, and has played Jazz Festivals and toured across Canada, the United States, and Europe with many of Canada’s most creative jazz musicians. He has written commissioned works for the Humber College Community Music School, the Jazz Mechanics Big Band, and Trinity College Jazz Band. Jim’s composition ‘Don’t Cry’ was featured in Jazziz Magazine (October 2006)\nJim is a graduate of Humber College, the University of Toronto (Faculty of Education), and completed a Masters Degree in Performance (Concentration in Jazz) at the University of Louisville, where he studied trumpet performance with Dr. Michael Tunnell, composition and arranging with John LaBarbera, and improvisation with Jamey Aebersold. Jim is the Musical Director of the Ottawa Jazz Festival’s annual ‘Youth Jazz Summit', bringing together young jazz students aged 17 – 22 from across Canada to rehearse and perform during the Ottawa Jazz Festival.\nJim has adjudicated festivals and presented workshops across Canada and in the U.S.A., including clinics, a research paper and performing groups at the International Association of Jazz Educators Conferences in Chicago, New York, Anaheim and New Orleans. Jim is currently a Sessional Instructor at The University of Toronto (Jazz Studies) where he teaches Trumpet, Jazz and Traditional Materials, Ear Training, Improvisation, Large and Small Ensembles, and Graduate Seminar in Jazz Literature, and is also an adjunct faculty member at Humber College."]
                            [:div.clear]]]
                :charts [:div#charts
                         [:div#list
                          [:div#63.chart.grade4 chart-divs/surface-tension]]]
                :users [:div#users]}
   "josh-grossman" {:title "Josh Grossman - Clovertone Music"
                    :contents [:div#contents
                               [:div#content
                                [:h1.title "Josh Grossman"]
                                [:img.float {:src "/images/josh-grossman.jpg"}]
                                [:p
                                 "Josh Grossman is a graduate of the University of Toronto’s Jazz Performance Program where he studied trumpet with Chase Sanborn and Kevin Turcotte; he has performed in big bands under the direction of Phil Nimmons, Paul Read, Ron Collier and Paul Ashwell. Josh is the founder, Artistic Director and conductor of the Toronto Jazz Orchestra (TJO), celebrating its tenth anniversary in 2009. Since its inception, the TJO has released three CDs, performed with Phil Nimmons, Seamus Blake and Kurt Elling, and has presented special concerts including the music of Phil Nimmons, Stan Kenton, the Thad Jones/Mel Lewis Orchestra, and West Side Story. Josh was on faculty at either Scarborough Music Camp or Music by the Lake (both with the Toronto District School Board) for eight years and has been an adjudicator with Music Alive and PIMTA since 2008. Josh can be seen performing with his Toronto Jazz Orchestra and with the Chris Hunt Tentet; he has been the Artistic Director of the Markham Jazz Festival since 2006."]
                                [:div.clear]]]
                    :charts [:div#charts
                             [:div#list
                              [:div#21.chart.grade4 chart-divs/chazz]
                              [:div#22.chart.grade4 chart-divs/amazing-grace]
                              [:div#23.chart.grade4 chart-divs/the-path]
                              [:div#58.chart.grade3 chart-divs/the-wiggle]]]
                    :users [:div#users]}
   "liam-gallagher" {:title "Liam Gallagher - Clovertone Music"
                     :contents [:div#contents
                                [:div#content
                                 [:h1.title "Liam Gallagher"]
                                 [:img.float {:src "/images/liam-gallagher.jpg"}]
                                 [:p
                                  "Liam Gallagher composes for his 12tet Jazzasaurus Rex, his 8 piece studio outfit Octorock, written for community and university ensembles such as U of T's 11 O'Clock Jazz Orchestra, and the Hart House Jazz Orchestra, and freelances in the video game industry, shipping titles with studios including BR Warner Studios, and Crystallized Games. Liam Gallagher was educated at the University of Toronto where he studied arranging with Terry Promane and bass with Andrew Downing."]
                                 [:div.clear]]]
                     :charts [:div#charts
                              [:div#list
                               [:div#103.chart.grade3 chart-divs/junk]]]
                     :users [:div#users]}
   "maria-kundakcioglu" {:title "Maria Kundakcioglu - Clovertone Music"
                         :contents [:div#contents
                                    [:div#content
                                     [:h1.title "Maria Kundakcioglu"]
                                     [:img.float {:src "/images/maria-kundakcioglu.jpg"}]
                                     [:p
                                      "Drummer, percussionist, pianist, and composer Maria Kundakcioglu is a senior student at Martingrove Collegiate Institute in Toronto. She graduated from the Special Advanced Program at the Yamaha Music School where she began composing for piano at the age of 6. She has since recorded and performed her compositions arranged for various ensembles with professional musicians in Toronto, Edmonton, Winnipeg, Whistler, and at the Asian Oceania Junior Original Concert in Thailand, Bangkok. Maria was inspired to begin arranging her compositions for stage band by her school conductor after hearing her perform her combo arrangement of “Sol Fiesta” performed at the Living Arts Center in Toronto in a tribute concert for Oscar Peterson. Consequently, the John G. Althouse middle school stage band brought home the gold and adjudicator’s award from The Heritage Music Festival in Chicago in 2006 along with first place at the Kiwanis Ontario Provincial Music Festival with Maria’s composition and arrangement of “Sol Fiesta” as part of their repertoire.Her composition “Tumbadora” was debuted in a combo version at the Sheraton Centre for the Performing Arts while opening for Herbie Hancock during the Toronto Downtown Jazz Festival in 2007. Currently, Maria teaches drums privately, writes and sings with the band “A Goodbye Incident!”, can be found counseling and teaching percussion at Mono Cliffs and Albion Hills Toronto District School Board summer camps, conducting her school choir, and playing percussion and piano with the Etobicoke Youth Band and many performing ensembles at her high school."]
                                     [:div.clear]]]
                         :charts [:div#charts
                                  [:div#list
                                   [:div#39.chart.grade3 chart-divs/sol-fiesta]
                                   [:div#40.chart.grade3 chart-divs/tumbadora]]]
                         :users [:div#users]}
   "michael-kundakcioglu" {:title "Michael Kundakcioglu - Clovertone Music"
                           :contents [:div#contents
                                      [:div#content
                                       [:h1.title "Michael Kundakcioglu"]
                                       [:img.float {:src "/images/michael-kundakcioglu.jpg"}]
                                       [:p
                                        "Saxophonist and pianist, Michael is a graduate of the Junior Special Advanced Program at the Yamaha Music School in Toronto. Currently a student at John G. Althouse Middle school in Toronto, Michael enjoys playing lead alto and singing with the award winning stage band, concert bands, chamber, concert and jazz choirs. Michael debuted his composition “Funk Out” with the Etobicoke Youth Stage Band with great success at the Palais Royale in Toronto in 2009.When Michael is not composing, performing or practicing you can find him at a track racing high speed karts. Michael’s unwavering life long ambition is to become a professional musician and race car driver."]
                                       [:div.clear]]]
                           :charts [:div#charts
                                    [:div#list
                                     [:div#38.chart.grade4 chart-divs/funk-out]]]
                           :users [:div#users]}
   "terry-promane" {:title "Terry Promane - Clovertone Music"
                    :contents [:div#contents
                               [:div#content
                                [:h1.title "Terry Promane"]
                                [:img.float {:src "/images/terry-promane.jpg"}]
                                [:p
                                 "Terry Promane is an Associate Professor and Jazz Coordinator at the University of Toronto. A trombone, bass trombone and tuba player, Terry maintains a very active performing career in the theatres, recording studios and jazz clubs. He is a member of many of Toronto’s most prestigious jazz groups, including the Mike Murley Septet; the John MacLeod Big Band; the Paul Read Orchestra; the Kirk MacDonald Jazz Orchestra; Dave Young/Terry Promane Sextet/Octet/Big Band and the Carn Davidson 9. Many of these groups feature Terry’s original compositions and arrangements.A first-call session player, Terry can be heard on many jingles, film scores, and on the concert stage, performing with Holly Cole, the Toronto Symphony Orchestra, Ella Fitzgerald, Ray Charles, Mel Torme, Natalie Cole. Career highlights include, the Rob McConnell Tentet, the Boss Brass Kenny Wheeler, Bill Holman, Maria Schneider, Vince Mendoza. Terry Promane was twice named Jazz Trombonist of the Year by Jazz Report Magazine, and nominated three years in a row by the National Jazz Awards as Trombonist of the Year and Arranger of the Year. Other awards include 2 JUNO Awards as a member of the John MacLeod Big Band, The Rob McConnell Tentet and 2 JUNO nominations as a member of the Mike Murley Septet and the Kirk MacDonald Jazz Orchestra."]
                                [:div.clear]]]
                    :charts [:div#charts
                             [:div#list
                              [:div#62.chart.grade4 chart-divs/this-buts-for-you]
                              [:div#119.chart.grade4 chart-divs/a-cool-breeze]]]
                    :users [:div#users]}
   "tom-richards" {:title "Tom Richards - Clovertone Music"
                   :contents [:div#contents
                              [:div#content
                               [:h1.title "Tom Richards"]
                               [:img.float {:src "/images/tom-richards.jpg"}]
                               [:p
                                "Tom Richards is a trombonist, pianist and composer living in Toronto. He currently writes for projects Riverrun, Engine, and The Human Rights, the Tom Richards Trio and is also part of the acclaimed Avi Granite 6. Tom is currently on faculty at the Bayview Glen School."]
                               [:p "Check out Tom’s Projects at http://insoundmusic.com."]
                               [:div.clear]]]
                   :charts [:div#charts
                            [:div#list
                             [:div#78.chart.grade1 chart-divs/branta]
                             [:div#79.chart.grade1 chart-divs/moatfield-shuffle]
                             [:div#92.chart.grade2 chart-divs/summer-on-my-mind]
                             [:div#107.chart.grade2 chart-divs/roscos-big-hit]]]
                   :users [:div#users]}
   "index" {:title "All Charts - Clovertone Music"
            :contents [:div#contents
                       [:div#content
                        [:h1.title "All Charts"]
                        [:p
                         "Clovertone Music’s Composers are the who’s-who of Canadian professional musicians. You’ll see these musicians teaching at the top universities and colleges in the country, and playing in the pit orchestra’s of downtown shows, in music festivals and in the clubs. All have experience writing not only for professionals but also teaching and writing for students of all ages. Read about the people and help them make a living through writing music!"]
                        [:ul.composers
                         [:li
                          [:a.composer {:href "/composers/greg-crowe"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/greg-crowe-140.jpg"}]]
                          [:div.name "Greg Crowe"]]
                         [:li
                          [:a.composer {:href "/composers/tom-richards"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/tom-richards-140.jpg"}]]
                          [:div.name "Tom Richards"]]
                         [:li
                          [:a.composer {:href "/composers/allison-au"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/allison-au-140.jpg"}]]
                          [:div.name "Allison Au"]]
                         [:li
                          [:a.composer {:href "/composers/liam-gallagher"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/liam-gallagher-140.jpg"}]]
                          [:div.name "Liam Gallagher"]]
                         [:li
                          [:a.composer {:href "/composers/maria-kundakcioglu"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/maria-kundakcioglu-140.jpg"}]]
                          [:div.name "Maria Kundakcioglu"]]
                         [:li
                          [:a.composer {:href "/composers/brad-harrison"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/brad-harrison-140.jpg"}]]
                          [:div.name "Brad Harrison"]]
                         [:li
                          [:a.composer {:href "/composers/ewan-divitt"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/ewan-divitt-140.jpg"}]]
                          [:div.name "Ewan Divitt"]]
                         [:li
                          [:a.composer {:href "/composers/chris-hunt"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/chris-hunt-140.jpg"}]]
                          [:div.name "Chris Hunt"]]
                         [:li
                          [:a.composer {:href "/composers/brad-cheeseman"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/brad-cheeseman-140.jpg"}]]
                          [:div.name "Brad Cheeseman"]]
                         [:li
                          [:a.composer {:href "/composers/andy-ballantyne"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/andy-ballantyne-140.jpg"}]]
                          [:div.name "Andy Ballantyne"]]
                         [:li
                          [:a.composer {:href "/composers/josh-grossman"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/josh-grossman-140.jpg"}]]
                          [:div.name "Josh Grossman"]]
                         [:li
                          [:a.composer {:href "/composers/chelsea-mcbride"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/chelsea-mcbride-140.jpg"}]]
                          [:div.name "Chelsea McBride"]]
                         [:li
                          [:a.composer {:href "/composers/jason-logue"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/jason-logue-140.jpg"}]]
                          [:div.name "Jason Logue"]]
                         [:li
                          [:a.composer {:href "/composers/michael-kundakcioglu"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/michael-kundakcioglu-140.jpg"}]]
                          [:div.name "Michael Kundakcioglu"]]
                         [:li
                          [:a.composer {:href "/composers/terry-promane"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/terry-promane-140.jpg"}]]
                          [:div.name "Terry Promane"]]
                         [:li
                          [:a.composer {:href "/composers/erik-patterson"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/erik-patterson-140.jpg"}]]
                          [:div.name "Erik Patterson"]]
                         [:li
                          [:a.composer {:href "/composers/jim-lewis"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/jim-lewis-140.jpg"}]]
                          [:div.name "Jim Lewis"]]
                         [:li
                          [:a.composer {:href "/composers/christian-overton"}]
                          [:div.image
                           [:img
                            {:width "140",
                             :height "140",
                             :src "/images/christian-overton-140.jpg"}]]
                          [:div.name "Christian Overton"]]]]]
            :charts [:div#charts]
            :users [:div#users]}
   })
