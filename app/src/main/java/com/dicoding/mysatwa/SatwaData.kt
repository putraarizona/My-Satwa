package com.dicoding.mysatwa

object SatwaData {
    private val namaSatwa = arrayOf(
        "Harimau Sumatera",
        "Badak Sumatera",
        "Orang Utan",
        "Gajah Kalimantan",
        "Jalak Bali",
        "Komodo",
        "Burung Maleo",
        "Tarsius Kerdil",
        "Monyet Hitam Sulawesi",
        "Burung Cenderawasih"
    )
    private val namaLatinSatwa = arrayOf(
        "Panthera tigris sumatrae",
        "Dicerorhinus sumatrensis",
        "Pongo",
        "Elephas maximus borneensis",
        "Leucopsar rothschildi",
        "Varanus komodoensis",
        "Macrocephalon maleo",
        "Tarsius pumilus",
        "Macaca nigra",
        "Paradisaeidae"
    )
    private val namaLatinSatwa2 = arrayOf(
        "(Panthera tigris sumatrae)",
        "(Dicerorhinus sumatrensis)",
        "(Pongo)",
        "(Elephas maximus borneensis)",
        "(Leucopsar rothschildi)",
        "(Varanus komodoensis)",
        "(Macrocephalon maleo)",
        "(Tarsius pumilus)",
        "(Macaca nigra)",
        "(Paradisaea minor)"
    )
    private val detailSatwa = arrayOf(
        "Harimau sumatra adalah populasi Panthera tigris sondaica yang mendiami pulau Sumatra, Indonesia dan satu-satunya anggota subspesies harimau sunda yang masih bertahan hidup hingga saat ini. Ia termasuk dalam klasifikasi satwa kritis yang terancam punah (critically endangered) dalam daftar merah spesies terancam yang dirilis Lembaga Konservasi Dunia IUCN. Populasi liar diperkirakan antara 400-500 ekor, terutama hidup di Pegunungan Bukit Barisan jama sejarah taman-taman nasional di Sumatra jaman pra-sejarah.",
        "Badak sumatra, juga dikenal sebagai badak berambut atau badak Asia bercula dua (Dicerorhinus sumatrensis), merupakan spesies langka dari famili Rhinocerotidae dan termasuk salah satu dari lima spesies badak yang masih lestari. Badak sumatra merupakan satu-satunya spesies yang tersisa dari genus Dicerorhinus. Spesies ini merupakan jenis badak terkecil, meskipun masih tergolong hewan mamalia yang besar",
        "Orang utan (bentuk tidak baku: Orangutan) atau mawas adalah kera besar yang berasal dari hutan hujan Indonesia dan Malaysia. Sekarang mereka hanya ditemukan di sebagian Kalimantan dan Sumatera, tetapi selama era Pleistosen orang utan tersebar di seluruh Asia Tenggara dan Cina Selatan. Diklasifikasikan dalam genus Pongo, orang utan awalnya dianggap hanya satu spesies. Orang utan adalah kera besar yang paling arboreal, yang mana mereka menghabiskan sebagian besar waktu mereka di pohon. Orang utan memiliki lengan panjang dan kaki pendek secara proporsional, dan memiliki rambut coklat kemerahan yang menutupi tubuh mereka.",
        "Gajah kalimantan (Elephas maximus borneensis) adalah subspesies dari gajah asia dan dapat ditemukan di Kalimantan Utara dan Sabah. Asal usul gajah kalimantan masih merupakan kontroversi. Terdapat hipotesis bahwa mereka dibawa ke pulau Kalimantan. Pada tahun 2003, penelitian DNA mitokondria menemukan bahwa leluhurnya terpisah dari populasi daratan selama pleistosen, ketika jembatan darat yang menghubungkan Kalimantan dengan kepulauan Sunda menghilang 18.000 tahun yang lalu.",
        "Jalak Bali (Leucopsar rothschildi) adalah sejenis burung pengicau berukuran sedang, dengan panjang lebih kurang 25 cm, dari suku Sturnidae. Ia turut dikenali sebagai Curik Ketimbang Jalak. Jalak Bali hanya ditemukan di hutan bagian barat Pulau Bali dan merupakan hewan endemik Indonesia. Burung ini juga merupakan satu-satunya spesies endemik Bali dan pada tahun 1991 dinobatkan sebagai lambang fauna Provinsi Bali.",
        "Komodo atau lengkapnya biawak komodo (Varanus komodoensis), adalah spesies biawak besar yang terdapat di Pulau Komodo, Rinca, Flores, Gili Motang, dan Gili Dasami di Provinsi Nusa Tenggara Timur, Indonesia. Biawak ini oleh penduduk asli pulau Komodo juga disebut dengan nama setempat ora. Nama lain dari komodo adalah buaya darat, walaupun komodo bukanlah spesies buaya.",
        "Maleo Senkawor atau Maleo, yang dalam nama ilmiahnya Macrocephalon maleo adalah sejenis burung gosong berukuran sedang, dengan panjang sekitar 55cm, dan merupakan satu-satunya burung di dalam genus tunggal Macrocephalon. Yang unik dari maleo adalah, saat baru menetas anak burung maleo sudah bisa terbang. Ukuran telur burung maleo beratnya 240 gram hingga 270 gram per butirnya, ukuran rata-rata 11 cm, dan perbandingannya sekitar 5 hingga 8 kali lipat dari ukuran telur ayam.",
        "Tarsius kerdil (pygmy tarsier, Tarsius pumilus, mountain tarsier, lesser spectral tarsier), adalah sebuah primata nokturnal yang ditemukan di Sulawesi Tengah, Indonesia, di kawasan dengan keragaman spesies yang vegetatif rendah ketimbang hutan tropis dataran rendah. Tarsius kerdil diyakini punah pada awal abad ke-20. Kemudian, pada 2000, para ilmuwan Indonesia secara tak sengaja menewaskan seekor tarsius kerdil saat menjebak tikus. Tarsius kerdil pertama yang terlihat dalam keadaan hidup sejak 1920an ditemukan oleh tim riset pimpinan Dr. Sharon Gursky dan murid Ph.D.",
        "Monyet hitam sulawesi (Macaca nigra) adalah satwa endemik Indonesia yang hanya terdapat Pulau Sulawesi bagian utara dan beberapa pulau di sekitarnya. Yaki merupakan jenis monyet makaka terbesar yang ada di Pulau Sulawesi. Cirinya yang khas dari yaki adalah warna seluruh tubuhnya yang hitam dan memiliki rambut berbentuk jambul di atas kepalanya, serta memiliki pantat berwarna merah muda.",
        "Burung Cenderawasih adalah anggota famili Paradisaeidae dari ordo Passeriformes. Cendrawasih biasanya ditemukan di Indonesia seperti di bagian Timur Papua, Papua Nugini, pulau-pulau selat Torres, dan Australia timur. Burung anggota keluarga ini dikenal karena bulu burung jantan pada banyak jenisnya, terutama bulu yang sangat memanjang dan rumit yang tumbuh dari paruh, sayap atau kepalanya. Ukuran burung Cenderawasih mulai dari Cenderawasih raja pada 50 gram dan 15 cm hingga Cenderawasih paruh-sabit Hitam pada 110 cm dan Cenderawasih manukod jambul-bergulung pada 430 gram."
    )
    private val taksonomi = arrayOf(
        "Klasifikasi ilmiah Harimau Sumatera (Panthera tigris sumatrae):\n\n" +
                "Kerajaan: Animalia\n" +
                "Filum: Chordata\n" +
                "Kelas: Mamalia\n" +
                "Ordo: Carnivora\n" +
                "Famili:Felidae\n" +
                "Genus: Panthera\n" +
                "Spesies: Panthera tigris\n" +
                "Upaspesies: Panthera tigris sumatrae.\n    ",

        "Klasifikasi ilmiah Badak sumatra (Panthera tigris sumatrae):\n\n" +
                "Kingdom: Animalia\n" +
                "Filum: Chordata\n" +
                "Sub-filum: Vertebrata\n" +
                "Kelas: Mamalia\n" +
                "Super-ordo: Mesaxonia\n" +
                "Ordo: Perissodactyla\n" +
                "Super-famili: Rhinocerotides\n" +
                "Famili: Rhinocerotidae\n" +
                "Genus: Dicerorhinus\n" +
                "Spesies: Dicherorhinus sumatrensis",

        "Klasifikasi ilmiah Orang Utan (Pongo):\n\n" +
                "Kingdom: Animalia\n" +
                "Sub-kingdom: Metazoa\n" +
                "Filum: Chordata\n" +
                "Kelas: Mamalia\n" +
                "Ordo: Primata\n" +
                "Famili: Hominidae\n" +
                "Genus: Pongo\n" +
                "Spesies: Pongo pygmaeus",

        "Klasifikasi ilmiah Gajah kalimantan (Elephas maximus borneensis):\n\n" +
                "Kingdom: Animalia\n" +
                "Filum: Chordata\n" +
                "Kelas: Mammalia\n" +
                "Ordo: Proboscidea\n" +
                "Famili: Elephantidae\n" +
                "Genus: Elephas\n" +
                "Spesies: Elephas maximus\n" +
                "Subspesies: Elephas maximus borneensis",

        "Klasifikasi ilmiah Jalak Bali (Leucopsar rothschildi):\n\n" +
                "Kingdom: Animalia\n" +
                "Filum: Chordata\n" +
                "Kelas: Aves\n" +
                "Ordo: Passeriformes\n" +
                "Famili: Sturnidae\n" +
                "Genus: Leucospar\n" +
                "Spesies: Leucopsar rothschildi  (Stressmann 1912)",

        "Klasifikasi ilmiah Komodo (Varanus komodoensis):\n\n" +
                "Kingdom: Animalia\n" +
                "Phylum: Chordata\n" +
                "Class: Reptilia\n" +
                "Subclass: Diapsita\n" +
                "Ordo: Squamata\n" +
                "Sub–ordo: Sauria (Lacertilia)\n" +
                "Infra–ordo: Autarchoglossa\n" +
                "Family: Varanidae\n" +
                "Genus: Varanus\n" +
                "Species: Varanus komodoensis Ouwens",

        "Klasifikasi ilmiah Maleo (Macrocephalon maleo):\n\n" +
                "Kingdom: Animalia\n" +
                "Subkingdom: Bilateria\n" +
                "Infrakingdom: Deuterostomia\n" +
                "Filum: Chordata\n" +
                "Subfilum: Verterbrata\n" +
                "Infrafilum: Gnathostomata\n" +
                "Superkelas: Tetrapoda\n" +
                "Kelas: Aves\n" +
                "Ordo: Galliformes\n" +
                "Famili: Megapodiidae\n" +
                "Genus: Macrocephalon\n" +
                "Spesies: Macrocephalon maleo",

        "Klasifikasi Tarsius kerdil (Tarsius pumilus):\n\n" +
                "Kingdom: Animalia\n" +
                "Phylum: Chordata\n" +
                "Class: Reptilia\n" +
                "Subclass: Mammalia\n" +
                "Ordo: Primata\n" +
                "Family: Tarsiidae\n" +
                "Genus: Tarsius \n" +
                "Species: Tarsius pumilus",

        "Klasifikasi Monyet hitam sulawesi (Macaca nigra):\n\n" +
                "Kingdom: Animalia\n" +
                "Phylum: Chordata\n" +
                "Class: Mammalia\n" +
                "Ordo: Primata\n" +
                "Family: cercophithecidae\n" +
                "Genus: Macaca\n" +
                "Species: Macaca nigra",

        "Klasifikasi Cenderawasih (Paradisaea minor):\n\n" +
                "Kingdom: Animalia\n" +
                "Phylum: Chordata\n" +
                "Class: Aves\n" +
                "Ordo: Passeriformes\n" +
                "Family: Paradisaea\n" +
                "Genus: Lycocorax\n" +
                "Species: Paradisaea minor"
    )
    private val satwaImages = intArrayOf(
        R.drawable.harimau_sumatera,
        R.drawable.badak_sumatera,
        R.drawable.orang_utan,
        R.drawable.gajah_kalimantan,
        R.drawable.jalak_bali,
        R.drawable.komodo,
        R.drawable.burung_maleo,
        R.drawable.tarsius,
        R.drawable.monyet_hitam_sulawesi,
        R.drawable.burung_cenderawasih)

    val listData: ArrayList<Satwa>
        get() {
            val list = arrayListOf<Satwa>()
            for (position in namaSatwa.indices) {
                val satwa = Satwa()
                satwa.name = namaSatwa[position]
                satwa.name_latin = namaLatinSatwa[position]
                satwa.name_latin2 = namaLatinSatwa2[position]
                satwa.detail = detailSatwa[position]
                satwa.taksonomi = taksonomi[position]
                satwa.photo = satwaImages[position]
                list.add(satwa)
            }
            return list
        }
}

