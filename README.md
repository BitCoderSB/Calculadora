<div align="center">

# 🌦️ Skylikely

### *Redefining Climate Intelligence*

[![NASA Space Apps 2025](https://img.shields.io/badge/NASA%20Space%20Apps-2025-blue?style=for-the-badge&logo=nasa&logoColor=white)](https://www.spaceappschallenge.org/2025/find-a-team/pixelstorm/?tab=project)
[![Challenge](https://img.shields.io/badge/Challenge-Will%20It%20Rain%20On%20My%20Parade%3F-orange?style=for-the-badge)](https://www.spaceappschallenge.org/2025/challenges/will-it-rain-on-my-parade/)
[![Live Demo](https://img.shields.io/badge/Live%20Demo-Render-46E3B7?style=for-the-badge&logo=render&logoColor=white)](https://skylikely-pixelstorm-o25i.onrender.com/)
[![YouTube Demo](https://img.shields.io/badge/Demo%20Video-YouTube-red?style=for-the-badge&logo=youtube&logoColor=white)](https://www.youtube.com/watch?v=-Xc54RX6Yvc)

<br />

*Transform decades of NASA Earth observation data into actionable climate intelligence.*

---

</div>

## 📖 About

**Skylikely** is a probabilistic climate analysis platform built for the [NASA Space Apps Challenge 2025](https://www.spaceappschallenge.org/2025/) — Challenge: ***Will It Rain On My Parade?***

Select any location on the globe and a date — Skylikely calculates the probability of experiencing extreme weather conditions (very hot, very wet, or very windy days) using **23 years of NASA historical data (2001–2024)**. Results are presented through an interactive dashboard combining 2D maps, a 3D globe, probability cards, and time-series charts.

> Unlike short-term weather forecasts, Skylikely leverages historical climate distributions and statistical models to reveal the **likelihood** of extreme events at any point of the year.

### Why it matters

- 🌾 **Agriculture** — Plan planting and harvesting around historical weather patterns
- ✈️ **Tourism & Events** — Choose dates with the lowest risk of adverse conditions
- 🏗️ **Risk Management** — Anticipate extreme conditions to reduce economic losses
- 📊 **Education & Research** — Democratize access to advanced climate analysis

---

## 🚀 Features

| Feature | Description |
|---------|-------------|
| 🗺️ **Interactive 2D Map** | Leaflet + Mapbox GL with geocoder search |
| 🌍 **Immersive 3D Globe** | Globe.gl + Three.js for spatial exploration |
| 📊 **Probability Cards** | Clear probability indicators for heat, rain, and wind |
| 📈 **Time-Series Charts** | Chart.js visualizations of climate patterns |
| 🎯 **Flexible Area Selection** | Circle or polygon selection with real-time analysis |
| ⚡ **Percentile Models** | Statistical models based on P10, P50, P90 and extreme value distributions |
| 🎨 **Lottie Animations** | Weather-themed animated icons for intuitive UX |

---

## 🛠️ Tech Stack

<div align="center">

### Frontend
![React](https://img.shields.io/badge/React_18-61DAFB?style=flat-square&logo=react&logoColor=black)
![Vite](https://img.shields.io/badge/Vite_5-646CFF?style=flat-square&logo=vite&logoColor=white)
![Tailwind CSS](https://img.shields.io/badge/Tailwind_CSS-06B6D4?style=flat-square&logo=tailwindcss&logoColor=white)
![Zustand](https://img.shields.io/badge/Zustand-443E38?style=flat-square&logo=react&logoColor=white)
![Framer Motion](https://img.shields.io/badge/Framer_Motion-0055FF?style=flat-square&logo=framer&logoColor=white)
![Mapbox](https://img.shields.io/badge/Mapbox_GL-000000?style=flat-square&logo=mapbox&logoColor=white)
![Chart.js](https://img.shields.io/badge/Chart.js-FF6384?style=flat-square&logo=chartdotjs&logoColor=white)
![Three.js](https://img.shields.io/badge/Three.js-000000?style=flat-square&logo=threedotjs&logoColor=white)

### Backend
![FastAPI](https://img.shields.io/badge/FastAPI-009688?style=flat-square&logo=fastapi&logoColor=white)
![Python](https://img.shields.io/badge/Python-3776AB?style=flat-square&logo=python&logoColor=white)
![NumPy](https://img.shields.io/badge/NumPy-013243?style=flat-square&logo=numpy&logoColor=white)
![Pandas](https://img.shields.io/badge/Pandas-150458?style=flat-square&logo=pandas&logoColor=white)
![scikit--learn](https://img.shields.io/badge/scikit--learn-F7931E?style=flat-square&logo=scikitlearn&logoColor=white)
![xarray](https://img.shields.io/badge/xarray-E67E22?style=flat-square)

### Deployment
![Render](https://img.shields.io/badge/Render-46E3B7?style=flat-square&logo=render&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=flat-square&logo=docker&logoColor=white)
![Gunicorn](https://img.shields.io/badge/Gunicorn-499848?style=flat-square&logo=gunicorn&logoColor=white)

</div>

---

## 🏗️ Architecture

```
skylikely-pixelstorm/
├── frontend/                     # React 18 + Vite SPA
│   ├── src/
│   │   ├── components/           # UI components (maps, charts, cards)
│   │   │   ├── pages/            # WelcomePage, ParameterSelection, Results
│   │   │   └── ui/               # Reusable UI elements (Lottie, Glow, etc.)
│   │   ├── lib/                  # Utilities (math, mapping, fetch)
│   │   └── store/                # Zustand global state
│   └── public/                   # Static data, animations, tiles
│
├── clima-prob-backend/           # Python backend
│   ├── api/
│   │   ├── app/
│   │   │   ├── nasa/             # NASA data ingestion (GLDAS, IMERG, Giovanni)
│   │   │   ├── prob/             # Probability engine (logistic, empirical, thresholds)
│   │   │   ├── routes/           # FastAPI endpoint definitions
│   │   │   └── config/           # Environment & settings
│   │   └── tests/                # API & health tests
│   └── notebooks/                # Exploratory data analysis
│
└── render.yml                    # Render deployment config
```

---

## 📡 NASA Data Sources

| Dataset | Description | Resolution |
|---------|-------------|------------|
| [GLDAS Noah](https://disc.gsfc.nasa.gov/datasets/GLDAS_NOAH025_3H_2.1/summary) | Land surface temperature & wind | 3-hourly, 0.25° |
| [GPM IMERG](https://disc.gsfc.nasa.gov/datasets/GPM_3IMERGDF_07/summary) | Global precipitation | Daily, 0.1° |
| [MERRA-2](https://disc.gsfc.nasa.gov/datasets/M2T1NXSLV_V5.12.4/summary) | Atmospheric reanalysis | Hourly, 0.5° × 0.625° |
| [Giovanni](https://www.earthdata.nasa.gov/learn/find-data/giovanni) | Data visualization & analysis API | Variable |

All data is accessed through [NASA Earthdata](https://urs.earthdata.nasa.gov/) and the [earthaccess](https://github.com/nsidc/earthaccess) Python library.

---

## ⚡ Getting Started

### Prerequisites

- **Node.js** >= 18
- **Python** >= 3.10
- **NASA Earthdata account** — [Register here](https://urs.earthdata.nasa.gov/users/new)

### Backend

```bash
cd clima-prob-backend
conda env create -f environment.yml
conda activate clima-prob

# Configure environment
cp api/.env.example api/.env
# Add your EARTHDATA_USERNAME and EARTHDATA_PASSWORD

# Run
cd api
uvicorn app.main:app --reload
```

### Frontend

```bash
cd frontend
npm install

# Configure environment
cp .env.example .env
# Add your API URL and Mapbox token

# Run
npm run dev
```

---

## 👥 Team PixelStorm

<div align="center">

| | Name | Location |
|---|------|----------|
| 👑 | **Antonio Zempoaltecatl Navarro** | Puebla, Mexico |
| 🧑‍💻 | **Luis Alberto González Muñoz** | Puebla, Mexico |
| 🧑‍💻 | **Aldair Iglesias Hernández** | Puebla, Mexico |
| 🧑‍💻 | **Carlos Alberto Sánchez Bonilla** | Puebla, Mexico |

</div>

> 📍 **Local Event:** Puebla, Mexico &nbsp;|&nbsp; 🏆 **NASA Space Apps Challenge 2025**

---

## 📄 License

This project was created for the [NASA Space Apps Challenge 2025](https://www.spaceappschallenge.org/2025/).

---

<div align="center">

**[Live Demo](https://skylikely-pixelstorm-o25i.onrender.com/)** · **[Video Demo](https://www.youtube.com/watch?v=-Xc54RX6Yvc)** · **[Challenge Page](https://www.spaceappschallenge.org/2025/find-a-team/pixelstorm/?tab=project)**

<br />

*Built with ❤️ and NASA data by Team PixelStorm*

</div>
